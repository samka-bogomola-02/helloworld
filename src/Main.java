public class Main {
    public static void main(String[] args) {
    // Задача 1
        byte age = 17, age1 = 18;
        if (age >= age1) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то он достиг совершеннолетия.");
        } else if (age < age1) {
            System.out.println("\nЕсли возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    // Задача 2
        byte temp = -12, temp1 = 5;
        if (temp <= temp1) {
            System.out.println("\nНа улице " + temp + " градусов, нужно надеть шапку.");
        } else if (temp > temp1) {
            System.out.println("\nНа улице " + temp + " градусов, можно идти без шапки.");
        }
    // Задача 3
        byte speed = 88, speed1 = 60;
        if (speed <= speed1) {
            System.out.println("\nЕсли скорость " + speed + " можно ездить спокойно.");
        } else if (speed > speed1) {
            System.out.println("\nЕсли скорость " + speed + " - придется заплатить штраф.");
        }
    // Задача 4
        byte Age = 34, Age1 = 2, Age2 = 6, Age3 = 7, Age4 = 17, Age5 = 18, Age6 = 24;
        if (Age >= Age1 && Age <= Age2){
            System.out.println("\nЕсли возраст человека равен " + Age + ", то ему нужно ходить в детский сад.");
        } else if (Age >= Age3 && Age <= Age4) {
            System.out.println("\nЕсли возраст человека равен " + Age + ", то ему нужно ходить в школу.");
        } else if (Age >= Age5 && Age <= Age6) {
            System.out.println("\nЕсли возраст человека равен " + Age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("\nЕсли возраст человека равен " + Age + ", то ему пора ходить на работу.");
        }
    // Задача 5
        byte ageChild = 5, ageChild1 = 5, ageChild2 = 14;
        if (ageChild < ageChild1){
            System.out.println("\nЕсли возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageChild >= ageChild1 && ageChild < ageChild2) {
            System.out.println("\nЕсли возраст ребенка равен " + ageChild + ", то ему можно кататься в сопровождении взрослого.");
        } else {
            System.out.println("\nЕсли возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения взрослого.");
        }
    // Задача 6
        byte totalPlaces = 102, seatPlace = 60;
        byte place = 98;
        if (place <= seatPlace) {
            System.out.println("\nВ вагоне есть сидячие места.");
        } else if (place > seatPlace && place <= totalPlaces) {
            System.out.println("\nПридётся ехать стоя.");
        } else {
            System.out.println("\nМест нет");
        }
    // Задача 7
        int one = 46, two = 87, three = 71;
        if (one > two && one > three) {
            System.out.println("\nЧисло " + one + " больше числа " + two + " и числа " + three);
        } else if (two > one && two > three) {
            System.out.println("\nЧисло " + two + " больше числа " + one + " и числа " + three);
        } else {
            System.out.println("\nЧисло " + three + " больше числа " + one + " и числа " + two);
        }

    }
}