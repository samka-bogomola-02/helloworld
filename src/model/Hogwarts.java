package model;

import java.util.Objects;

public abstract class Hogwarts {
    private final String name;
    private final String faculty;
    private final int transgression;
    private final int magicPower;

    public Hogwarts(String name, String faculty, int transgression, int magicPower) {
        this.name = name;
        this.faculty = faculty;
        this.transgression = transgression;
        this.magicPower = magicPower;
    }
    public static void likenStudentsHogw(Hogwarts student, Hogwarts student1){
        if (student.getPower() > student1.getPower()){
            System.out.println(String.format(student + " обладает большей мощьностью магии, чем " + student1));
        } else if (student.getPower() < student1.getPower()) {
            System.out.println(String.format(student1 + " обладает большей мощьностью магии, чем " + student));
        } else {
            System.out.println("Студенты " + student + " и " + student1 + " одинаково успешны");
        }
    }
    private int getPower(){
        return transgression + magicPower;
    }

    public String getName() {
        return name;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getTransgression() {
        return transgression;
    }
    public int getMagicPower() {
        return magicPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts hogwarts)) return false;
        return transgression == hogwarts.transgression && magicPower == hogwarts.magicPower && Objects.equals(name, hogwarts.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, transgression, magicPower);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPover=" + magicPower +
                '}';
    }
}
