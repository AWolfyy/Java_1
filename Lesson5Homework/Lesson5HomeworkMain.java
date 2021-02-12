public class Lesson5HomeworkMain {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@company.com",
                "8 (999) 000 00 00", 50000, 50);
        employees[1] = new Employee("Сергеев Сергей Сергеевич", "Прораб", "sergeev@company.com",
                "8 (999) 111 11 11", 40000, 42);
        employees[2] = new Employee("Александров Александр Александрович", "ГенДиректор",
                "aleksandrov@company.com", "8 (999) 222 22 22", 1000000, 30);
        employees[3] = new Employee("Никитин Никита Никитович", "Грузчик", "nikitin@company.com",
                "8 (999) 333 33 33", 30000, 43);
        employees[4] = new Employee("Алёнова Алёна Алёновна:)", "Бухгалтер", "alenova@company.com",
                "8 (999) 444 44 44", 500000, 29);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age < 40){
                Employee.printInfo(employees[i]);
                System.out.println();
            }
        }
    }
}
