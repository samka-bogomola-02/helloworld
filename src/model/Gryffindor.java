package model;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, String faculty, int transgression, int magicPower, int nobility, int honor, int bravery) {
        super(name, faculty, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void likenStudentsGryf(Gryffindor student){
        if (getPower() > student.getPower()){
            System.out.println(String.format(this + " лучший Гриффиндорец, чем " + student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format(student + " лучший Гриффиндорец, чем " + this));
        } else {
            System.out.println("Студенты " + this + " и " + student + " одинаково успешны");
        }
    }
    private int getPower(){
        return bravery + honor + nobility;
    }

    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gryffindor that)) return false;
        if (!super.equals(o)) return false;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    public String toStringFullInfo() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", name='" + super.getName() + '\'' +
                ", transgression=" + super.getTransgression() +
                ", magicPover=" + super.getMagicPower() +
                '}';
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getFaculty();
    }
}
