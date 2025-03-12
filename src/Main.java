//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*1 Создать классы Кот и Собака. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 Результатом выполнения действия будет вывод в консоль(Например, dogBobik.run(150); -> “Бобик пробежал 150 м.”.
 Учесть, что у каждого животного есть ограничения на действие(бег: кот 200 м, собака 500 м; плавание: кот не умеет плавать, собака 10 м).
 Добавить подсчет созданных котов, собак и животных

2 Создать класс Сотрудник с полями: ФИО, должность, email, телефон, зарплата и возраст. Конструктор класса должен заполнять эти поля при создании объекта.
Написать метод в этом классе, который выводит информацию об объекте в консоль в виде красиво оформленной строки.
Создать массив из 5 сотрудников и с помощью цикла foreach вывести информацию только о сотрудниках старше 40 лет*/

//https://github.com/zaharro/Classes.git

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Мурка");
        cat1.Swims(120);
        cat2.Swims(100);
        cat1.Runs(350);
        cat2.Runs(40);

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Тузик");
        Dog dog3 = new Dog("Динго");
        dog1.Swims(200);
        dog1.Runs(600);
        dog2.Swims(300);
        dog2.Runs(400);

        System.out.println("\nВсего создано " + Animals.numberOfAnimals + " животных\n");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Петр Петров", "Директор", "pp@mail.ru", 911955677, 500000, 50);
        employees[1] = new Employee("Сидр Сидоров", "Бухгалтер", "ss@mail.ru", 911955678, 150000, 35);
        employees[2] = new Employee("Иван Михайлов", "Стажер", "ss@mail.ru", 911955679, 100000, 39);
        employees[3] = new Employee("Иван Степанов", "Председатель", "is@mail.ru", 911955680, 600000, 42);
        employees[4] = new Employee("Галина Ефремова", "Инженер", "ge@mail.ru", 911955688, 200000, 44);


        System.out.println("Информация о сотрудниках старше 40 лет:\n");

        for (Employee i : employees) {
            if (i.getAge() > 40)
                i.showInfo();
        }
        ;

    }
}






