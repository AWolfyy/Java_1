class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public static void printInfo(Employee employee) {
        System.out.printf("ФИО сотрудника: %s%nДолжность: %s%nЭлектронная почта: %s%nТелефонный номер: %s" +
                        "%nЗаработная плата: %d%nВозраст: %d%n", employee.fullName, employee.position, employee.email,
                employee.phoneNumber, employee.salary, employee.age);
    }

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
}
