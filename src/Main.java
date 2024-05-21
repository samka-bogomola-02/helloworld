public class Main {
    public static void main(String[] args) {
    // Задача 1
        int clientOS =2;
        if (clientOS == 1){
            System.out.println("\nУстановите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("\nУстановите версию приложения для Android по ссылке.");
        } else {
            System.out.println("\nНет такого приложения.");
        }
    // Задача 2
        int year = 2024;
        int clientOS2 = 0;
        int clientDeviceYear = 2024;
        if (clientOS2 == 1 && clientDeviceYear < year){
            System.out.println("\nУстановите облегченную версию приложения для IOS по ссылке.");
        } else if (clientOS2 == 1 && clientDeviceYear >= year) {
            System.out.println("\nУстановите версию приложения для IOS по ссылке.");
        } else if (clientOS2 == 0 && clientDeviceYear < year) {
            System.out.println("\nУстановите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS2 == 0 && clientDeviceYear >= year) {
            System.out.println("\nУстановите версию приложения для Android по ссылке.");
        }
    // Задача 3
        int yearForThirdTask = 1200;
        boolean yearIsValid = yearForThirdTask >= 1584;
        boolean yearIsLeap = yearForThirdTask % 4 == 0 && yearForThirdTask % 100 != 0 || yearForThirdTask % 400 == 0;
        if (yearIsValid && yearIsLeap){
            System.out.println("\nВысокосный год");
        } else {
            System.out.println("\nНе высокосный год");
        }
    // Задача 4
        int deliveryDistance = 102;
        int deliveryDay = 1;
        if (deliveryDistance < 20){
            System.out.println("\nПотребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("\nПотребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println("\nПотребуется дней: " + deliveryDay);
        } else {
            System.out.println("\nДоставки нет.");
        }
    // Задача 5
        int mouthNumber = 4;
        switch (mouthNumber){
            case 12, 1, 2 -> System.out.println("\nЭто зима.");
            case 3, 4, 5 -> System.out.println("\nЭто весна.");
            case 6, 7, 8 -> System.out.println("\nЭто лето.");
            case 9, 10, 11 -> System.out.println("\nЭто осень.");
            default -> System.out.println("\nНе валидный месяц");
        }



    }
}