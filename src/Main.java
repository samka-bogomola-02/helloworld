import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printleapYear(1664);
        printValidTypeInfo(0,2024);
        calculateDeliveryDays(95);
    }
    //1
    public static void printleapYear (int year) {
        if (year > 1584 && (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)) {
            System.out.println("\n" + year + " год является высокосным.");
        } else {
            System.out.println("\n" + year + " год не является высокосным.");
        }
    }
    //2
    public static void printValidTypeInfo(int type, int year) {
        int currentYear = LocalDate.now().getYear();
        String resultType;
        String resultStatus;

        if (type == 1){
            resultType = "для IOS.";
        } else {
            resultType = "для Android.";
        }
        if (year < currentYear) {
            resultStatus = " облегченную ";
        } else {
            resultStatus = "";
        }
        System.out.println("\nУстановите" + resultStatus + " версию приложения " + resultType);
    }
    //2
    public static int calculateDeliveryDays(int distance){
        int resultDays = 1;
        if (distance <= 20) {
            //resultDays++;
            System.out.println("\nПотребуется дней: " + resultDays);
        }
        else if (distance > 20 && distance <= 60) {
            resultDays++;
            System.out.println("\nПотребуется дней: " + resultDays);
        }
        else if (distance > 60 && distance <= 100) {
            resultDays+=2;
            System.out.println("\nПотребуется дней: " + resultDays);
            return -1;
        }
        else if (distance > 100) {
            System.out.println("\nДоставки нет.");
        }
        return resultDays;
    }
}