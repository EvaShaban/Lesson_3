public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Eva", "Программист", "eva@mail.ru", "8044 777 111 222", 5000, 32);

        employee.displayInfo();


    }
}

class Employee {
    // Поля класса
    private String name;
    private String position;
    private String mail;
    private String tel;
    private double salary;
    private int age;


    // Конструктор класса
    public Employee(String name, String position, String mail,String tel, double salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;



    }

    // Метод для вывода информации о сотруднике
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + mail);
        System.out.println("Телефон: " + tel);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);



        System.out.println();
    }



}