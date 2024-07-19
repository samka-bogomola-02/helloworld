package model;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPover;

    public Slytherin(String name, String faculty, int transgression, int magicPover, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPover) {
        super(name, faculty, transgression, magicPover);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPover = thirstForPover;
    }
    public void likenStudentsSlyth(Slytherin student){
        if (getPover() > student.getPover()){
            System.out.println(this + " лучший Слизеринец, чем " + student);
        } else if (cunning + determination + ambition + resourcefulness + thirstForPover <
                student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPover) {
            System.out.println(student + " лучший Слизеринец, чем " + this);
        } else {
            System.out.println("Студенты" + this + " и " + student + " одинаково успешны");
        }
    }
    private int getPover(){
        int i1 = cunning + determination + ambition + resourcefulness + thirstForPover;
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
    public int getThirstForPover() {
        return thirstForPover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slytherin slytherin)) return false;
        if (!super.equals(o)) return false;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition &&
                resourcefulness == slytherin.resourcefulness && thirstForPover == slytherin.thirstForPover;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPover);
    }
    public String toStringFullInfo() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPover=" + thirstForPover +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPover=" + magicPover +
                '}';
    }
    @Override
    public String toString() {
        return name + " " + faculty;
    }
}
