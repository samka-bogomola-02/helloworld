package model;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    public final int nobility;
    public final int honor;
    public final int bravery;

    public Gryffindor(String name, String faculty, int transgression, int magicPower, int nobility, int honor, int bravery) {
        super(name, faculty, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public void likenStudentsGryf(Gryffindor student){
        if (getPover() > student.getPover()){
            System.out.println(String.format(this + " лучший Гриффиндорец, чем " + student));
        } else if (nobility + honor + bravery < student.nobility + student.honor + student.bravery) {
            System.out.println(String.format(student + " лучший Гриффиндорец, чем " + this));
        } else {
            System.out.println("Студенты " + this + " и " + student + " одинаково успешны");
        }
    }
    private int getPover(){
        int i = bravery + honor + nobility;
        return i;
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
