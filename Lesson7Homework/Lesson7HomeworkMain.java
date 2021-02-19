package Lesson7Homework;

public class Lesson7HomeworkMain {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Butterfly", 5),
                new Cat("String", 10),
                new Cat("Barrel", 50),
                new Cat("Cistern", 70)
        };
        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].toString());
        }

        plate.info();
    }
}
