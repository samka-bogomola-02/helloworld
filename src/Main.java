//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /* Задача 1 Объявите переменные типа int, byte, short, long, float, double.
    Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …». */
        int A = 2_149_567;
        byte B = 121;
        short C = 23_635;
        long D = 6_347_964_653_204_374_231L;
        float E = -4.24687f;
        double F = 833.45932996544;
        System.out.println("\nЗначение переменной A c типом int равно " + A);
        System.out.println("Значение переменной B c типом byte равно " + B);
        System.out.println("Значение переменной C c типом short равно " + C);
        System.out.println("Значение переменной D c типом long равно " + D);
        System.out.println("Значение переменной E c типом float равно " + E);
        System.out.println("Значение переменной F c типом double равно " + F);

    /* Задача 2 Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных
    Значения: 27.12; 987 678 965 549; 2,786; 569; -159; 27897; 67 */
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short f = 27_897;
        byte g = 67;

    /* Задача 3 У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
    Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
    Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги». */
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short sheetsPaper = 480;
        int totalStudents = class1 + class2 + class3;
        int quantityEach = sheetsPaper / totalStudents;
        System.out.println("\nНа каждого ученика расчитано " + quantityEach + " листов бумаги");

    /* Задача 4 Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
    Какая производительность машины будет: за 20 минут, в сутки, за 3 дня, за 1 месяц */
        byte min2 = 16;
        int min20 = min2 * 10;
        System.out.println("\nЗа 20 минут машина произвела " + min20 + " штук бутылок");
    // Узнаем сколько машина производит в час (60мин) и 24 часа.
        int h1 = min2 * 30;
        int h24 = h1 * 24;
        System.out.println("За 24 часа машина произвела " + h24 + " штук бутылок");
    // Узнаем сколько машина производит за 3 дня (72 часа)
        int h72 = h1 * 72;
        System.out.println("За 3 дня машина произвела " + h72 + " штук бутылок");
    // Узнаем сколько машина производит за месяц (стандартно 30 дней)
        int d30 = h24 * 30;
        System.out.println("За 1 месяц машина произвела " + d30 + " штук бутылок");

    /* Задача 5 На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
    На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено? */
        byte totalCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
    // Узнаем сколько всего классов
        int totalClasses = totalCans / (whiteCans + brownCans);
    // Узнаем сколько всего белой и коричневой краски
        int totalWhite = whiteCans * totalClasses;
        int totalBrown = brownCans * totalClasses;
        System.out.println("\nВ школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

    /* Задача 6 Бананы — 5 штук (1 банан — 80 грамм). Молоко — 200 мл (100 мл = 105 грамм).
    Мороженое-пломбир — 2 брикета по 100 грамм. Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
    Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы. */
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int bananaWeight = bananas * 80;
        int milkWeight = milk * (105 * 2);
        int iceWeight = iceCream * 100;
        int eggsWeight = eggs * 70;
        int breakfastWeight = bananaWeight + milkWeight + iceWeight + eggsWeight;
        System.out.println("\nОбщий вес завтрака в граммах составляет: " + breakfastWeight);
        double grams = 42880;
        double kilograms = grams / 1000;
        System.out.println("Общий вес завтрака в килограммах составляет: " + kilograms);

    /* Задача 7 Нужно сбросить 7 кг. От 250 до 500 грамм в день.
    Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
    а сколько — если каждый день будет худеть на 500 грамм. Посчитайте, сколько может потребоваться дней в среднем,
    чтобы добиться результата похудения. */
        short grams1 = 250;
        short grams2 = 500;
        byte kilograms1 = 7;
        int kilograms2 = kilograms1 * 1000;
        int amountDays1 = kilograms2 / grams1;
        System.out.println("\nЗа " + amountDays1 + " дней похудеет на 7 кг., если будет сбрасывать по 250 г. в день.");
        int amountDays2 = kilograms2 / grams2;
        System.out.println("За " + amountDays2 + " дней похудеет на 7 кг., если будет сбрасывать по 500 г. в день.");

    /* Задача 8 Маша получает 67 760 рублей в месяц. Денис получает 83 690 рублей в месяц.
    Кристина получает 76 230 рублей в месяц. Каждому нужно увеличить зарплату на 10% от текущей месячной.
    Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
    Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения. */
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int salaryAfter1 = salaryMasha * 110 / 100;
        int difference1 = (salaryAfter1 * 12) - (salaryMasha * 12);
        int salaryAfter2 = salaryDenis * 110 / 100;
        int difference2 = (salaryAfter2 * 12) - (salaryDenis * 12);
        int salaryAfter3 = salaryKristina * 110 / 100;
        int difference3 = (salaryAfter3 * 12) - (salaryKristina * 12);
        System.out.println("\nМаша теперь получает " + salaryAfter1 + " рублей. Годовой доход вырос на " + difference1 + " рублей.");
        System.out.println("Денис теперь получает " + salaryAfter2 + " рублей. Годовой доход вырос на " + difference2 + " рублей.");
        System.out.println("Кристина теперь получает " + salaryAfter3 + " рублей. Годовой доход вырос на " + difference3 + " рублей.");
    }
}