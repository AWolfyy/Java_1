package Lesson6Homework;

public class Cats extends Animal {
    private static int catCounter = 0;

    public Cats(String name) {
        super(name);
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.printf("%s пробежал(а) %d метр(а, ов)%n", getName(), distance);
        } else System.out.println("Я не могу пробежать больше 200 метров...");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки не умеют плавать!");
    }
}
