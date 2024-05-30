
class Animal {
    String name;
    static int totalAnimals = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}

class Dog extends Animal {
    static int totalDogs = 0;
    int runLimit = 500;
    int swimLimit = 10;

    public Dog(String name) {
        super(name);
        totalDogs++;
    }
}

class Cat extends Animal {
    static int totalCats = 0;
    int runLimit = 200;
    boolean fullness = false;

    public Cat(String name) {
        super(name);
        totalCats++;
    }

    void eat(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя покушать отрицательное количество еды!");
            return;
        }
        fullness = true;
        System.out.println(name + " покушал из миски.");
    }
}

class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить отрицательное количество еды!");
            return;
        }
        food += amount;
        System.out.println("Добавлено " + amount + " еды в миску.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик"), new Cat("Борис")};
        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(15);
        }

        System.out.println("Сытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.fullness ? "сыт" : "голоден"));
        }

        bowl.addFood(20);
    }
}