import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    /* Задача 1. Бухгалтеры попросили посчитать сумму всех выплат за месяц. Создайте массив с пятью
    целочисленными элементами и задайте каждому элементу значение. Напишите программу, которая решит эту задачу,
    и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».*/
        int[] salaries = {56000, 70000, 40000, 48000, 60000};
        int sum = 0;
        for (int i = 0; i < salaries.length; i++){
            sum += salaries[i];
        }
        System.out.println("\nСумма трат за месяц составила " + sum + "рублей");
    /* Задача 2. Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
    Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    «Минимальная сумма трат за неделю составила … рублей. Максимальная сумма трат за неделю составила … рублей».*/
        int salaryMin = salaries[0], salaryMax = salaries[0];
        for (int i = 0; i < salaries.length; i++){
            if (salaries[i] > salaryMax) {
                salaryMax = salaries[i];
            }
            if (salaries[i] < salaryMin) {
                salaryMin = salaries[i];
            }
        }
        System.out.println("\nМинимальная сумма трат за неделю составила " + salaryMin + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + salaryMax + " рублей");
    /* Задача 3. Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила еженедельно.
    Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
    Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить
    на количество недель), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».*/
        int Sum = 0;
        for (int i = 0; i< salaries.length; i++){
            Sum += salaries[i];
        }
        double avarage = (double) Sum / salaries.length;
        System.out.println("\nСредняя сумма трат за месяц составила " + avarage + " рублей\n");
    /* Задача 4. В бухгалтерской книге появился баг. Что-то пошло не так: фамилии и имена сотрудников начали отображаться
    в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде
    массива символов char[ ]. Напишите код, который развернет содержимое массива, а затем распечатайте его содержимое.
    В качестве данных для массива используйте: char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    В результате в консоль должно быть выведено: Ivanov Ivan. */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++){
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
        String str = "[I, v, a, n, o, v,  , I, v, a, n]\b";
        str = str.replace(",", "");
        System.out.println(str);

        String Str = str;
        Str = Str.substring(1);
        System.out.println(Str);
    }
}