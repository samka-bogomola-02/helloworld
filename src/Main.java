public class Main {
    public static void main(String[] args) {
    // 1.
        double total = 0, percent = 1.01;
        int deposite = 15_000, month = 1;
        while (total < 2_459_000){
            total = (total + deposite) * percent;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей.%n", month, total);
            month++;
        }
        System.out.println();
    // 2.
        int i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i != 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    // 3.
        int population = 12_000_000, years = 10;
        short birthRate = 17, mortality = 8;
        short populationAfter = (short) (birthRate - mortality);
        for (int year = 1; year <= years; year++){
            population += (int) (((float) population / 1_000) * populationAfter);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    // 4.
        int depositeVasya = 15_000, finalAmount = 12_000_000, monthVasya = 1;
        double percentVasya = 1.07;
        while (depositeVasya < finalAmount) {
            depositeVasya *= percentVasya;
            System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей.", monthVasya, depositeVasya);
            monthVasya++;
        }
        System.out.println();
    // 5.
        int DepositeVasya = 15_000, FinalAmount = 12_000_000, MonthVasya = 1;
        double PercentVasya = 1.07;
        while (DepositeVasya < FinalAmount) {
            DepositeVasya *= PercentVasya;
            if (MonthVasya % 6 == 0) {
                System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей.", MonthVasya, DepositeVasya);
            }
            MonthVasya++;
        }
    // 6.
        DepositeVasya = 15_000;
        int numberOfMonths = 12 * 9;
        for (int q = 1; q <= numberOfMonths; q++){
            DepositeVasya *= PercentVasya;
            if (q % 6 == 0) {
                System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей.", q, DepositeVasya);
            }
        }
    // 7.
        System.out.println("\n");
        int firstFriday = 5;
        for (int w = firstFriday; w < 31; w += 7){
            System.out.println("Сегодня пятница, " + w + " число, необходимо подготовить отчёт.");
        }
        System.out.println();
    // 8.
        int period = 79, currentYear = 2024;
        int lowerBorder = currentYear - 200, upperBorder = currentYear + 100;
        for (int y = 0; y < upperBorder; y += period){
            if (y > lowerBorder){
                System.out.println(y);
            }
        }
    }
}