import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    // Задача 1.
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("\nФ. И. О. сотрудника — " + fullName);
    // Задача 2.
        System.out.println("\nДанные Ф. И. О. сотрудника для заполнения отчета " + fullName.toUpperCase());
    // Задача 3.
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("\nДанные Ф. И. О. сотрудника — " + fullName);
    }
}