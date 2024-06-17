import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1.
        int year = 2025;
        printLeapYear(year);
        // Задача 2.
        printAppInstallationMessage(2015,2014,0);
        // Задача 3.
        int deliveryDistance = 50;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("\nПотребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("\nДоставки нет.");
        }
    }
    // Задача 1.
    public static void printLeapYear (int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
    // Задача 2.
    public static void printAppInstallationMessage(int deviceYear, int year, int clientOS) {
        if (clientOS == 0 && deviceYear < year ){
            System.out.println("\nУстановите облегченную версию приложения для IOS по ссылке.");
        } else if (clientOS == 0 && deviceYear >= year) {
            System.out.println("\nУстановите версию приложения для IOS по ссылке.");
        } else if (clientOS == 1 && deviceYear < year) {
            System.out.println("\nУстановите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && deviceYear >= year) {
            System.out.println("\nУстановите версию приложения для Android по ссылке.");
        }
    }
    // Задача 3.
    public static int distanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}