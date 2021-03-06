package Lesson6Homework;

public abstract class Animal {
    private String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public static int getCounter() {
        return counter;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
