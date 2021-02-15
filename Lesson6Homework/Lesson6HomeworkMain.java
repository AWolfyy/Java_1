package Lesson6Homework;

public class Lesson6HomeworkMain {
    public static void main(String[] args) {
        Animal dogRex = new Dogs("Rex");
        Animal catButterfly = new Cats("Butterfly");
        Animal dogGav = new Dogs("Gav");

        dogRex.run(150);
        dogRex.run(505);
        dogRex.swim(8);
        dogRex.swim(14);

        catButterfly.run(100);
        catButterfly.run(200);
        catButterfly.swim(10);
        System.out.printf("Общее количество животных: %d%nКоличество собак: %d%nКоличество кошек: %d%n" ,
                Animal.getCounter(),
                Dogs.getDogsCounter(),
                Cats.getCatCounter());
    }
}
