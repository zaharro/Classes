
/*2 Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата и возраст. Конструктор класса должен заполнять эти поля при создании объекта.
Написать метод в этом классе, который выводит информацию об объекте в консоль в виде красиво оформленной строки.*/

public class Employee
{
    private String fio;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    static int number = 0;


    public Employee(String fio, String position, String email, int phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {

        return age;
    }
    public void showInfo()
    {
        number ++;
        System.out.printf("%d.\t ФИО: %s, \tДолжность: %s,  \temail: %s, \tТелефон: %d, \tЗарплата: %d, \tВозраст: %d; \n", number, fio, position, email, phoneNumber, salary, age);

    }
}
