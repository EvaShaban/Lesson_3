public class Main {
    // это поля класса
    String name; //ФИО
    String position; //должность
    String email; //емейл
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст

    // это конструктор
    public Main (String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);}


    public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        Main [] persArray = new  Main[5];
        persArray[0] = new  Main("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        persArray[1] = new  Main("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
        persArray[2] = new  Main("Дмитрий Воробей", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
        persArray[3] = new  Main("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        persArray[4] = new  Main("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);


        for (int i=0; i < persArray.length; i++)
            System.out.println(persArray[i]);

    }
}