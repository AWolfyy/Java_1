package Lesson7Homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; //изначально = false, добавлять в конструктор необязательно.

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        //satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() <= appetite) {
            System.out.println("В этой тарелке не хватает еды... Сейчас добавлю... Вот так!");
            plate.increaseFood(appetite - plate.getFood());
        }
        plate.decreaseFood(appetite);
        satiety = true;
    }
}
