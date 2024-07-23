package model;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, String faculty, int transgression, int magicPover, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPover) {
        super(name, faculty, transgression, magicPover);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPover;
    }
    public void likenStudentsSlyth(Slytherin student){
        if (getPover() > student.getPover()){
            System.out.println(String.format(this + " лучший Слизеринец, чем " + student));
        } else if (cunning + determination + ambition + resourcefulness + thirstForPower <
                student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower) {
            System.out.println(String.format(student + " лучший Слизеринец, чем " + this));
        } else {
            System.out.println("Студенты" + this + " и " + student + " одинаково успешны");
        }
    }
    private int getPover(){
        int i1 = cunning + determination + ambition + resourcefulness + thirstForPower;
        return i1;
    }

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slytherin slytherin)) return false;
        if (!super.equals(o)) return false;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition &&
                resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }
    public String toStringFullInfo() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPover=" + thirstForPower +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPover=" + magicPower +
                '}';
    }
    @Override
    public String toString() {
        return name + " " + faculty;
    }
}
