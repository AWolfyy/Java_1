package Lesson5Homework;

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("ФИО сотрудника: %s%nДолжность: %s%nЭлектронная почта: %s%nТелефонный номер: %s" +
                        "%nЗаработная плата: %d%nВозраст: %d%n", fullName, position, email,
                phoneNumber, salary, age);
    }
    public int getAge() {
        return age;
    }
}
