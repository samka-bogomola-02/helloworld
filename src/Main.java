//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Задача 1 Переменные
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    // Задача 2 Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);
    // Задача 3 Теперь нужно уменьшить значение каждой переменной: dog на 3.5; cat на 1.6; paper на 7639.
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    /* Задача 4 Инициализируйте (присвойте значение) переменную friend значением 19.
    Увеличьте значение переменной на 2, после чего поделите значение на 7.*/
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    /* Задача 5 Инициализируйте переменную frog значением 3.5.
    Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4. */
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    /*Задача 6 Масса одного боксера — 78.2 кг. Масса второго боксера — 82.7 кг.
    Подсчитайте и выведите в консоль общую массу двух бойцов и разницу между массами бойцов. */
        var boxersMass1 = 78.2;
        var boxersMass2 = 82.7;
        System.out.println(boxersMass1 + boxersMass2);
        System.out.println(boxersMass1 - boxersMass2);
    // Задача 7 Найдите остаток от деления между двумя весами.
        System.out.println(boxersMass2 % boxersMass1);
    /* Задача 8, Часть 1. Решите задачу с помощью арифметических функций.
     640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
     то сколько всего работников в компании?
     Выведите результат задачи в консоль в формате: «Всего работников в компании */
        var workingHours = 640;
        var workers = workingHours / 8;
        System.out.println("Всего работников в компании: " + workers);
    /* Задача 8, Часть 2. Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
    если в компании работает на 94 человека больше. Выведите результат задачи в консоль в формате:
     «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками». */
        workers = workers + 94;
        workingHours = workingHours / workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + workingHours + " часа работы может быть поделено между сотрудниками.");
    }
}