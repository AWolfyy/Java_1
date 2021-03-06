package Lesson6Homework;

public class Dogs extends Animal {
    private static int dogsCounter = 0;

    public Dogs(String name) {
        super(name);
        dogsCounter++;
    }

    public static int getDogsCounter() {
        return dogsCounter;
    }

    @Override
    public void run(int distance) {
        if (distance < 500) {
            System.out.printf("%s пробежал(а) %d метр(а, ов)%n", getName(), distance);
        } else System.out.println("Я не могу пробежать больше 500 метров...");
    }

    @Override
    public void swim(int distance) {
        if (distance < 10) {
            System.out.printf("%s проплыл(а) %d метр(а, ов)%n", getName(), distance);
        } else System.out.println("Я не могу проплыть больше 10 метраов");
    }
}
