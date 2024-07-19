package model;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyal;
    private final int honest;

    public Hufflepuff (String name, String faculty, int transgression, int magicPover, int hardworking, int loyal, int honest) {
        super(name, faculty, transgression, magicPover);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public void likenStudentsHuff(Hufflepuff student){
        if (getPover() > student.getPover()){
            System.out.println(String.format(this + " лучший Пуффендуец, чем " + student));
        } else if (hardworking + loyal + honest < student.hardworking + student.loyal + student.honest) {
            System.out.println(String.format(student + " лучший Пуффендуец, чем " + this));
        } else {
            System.out.println(this + " и " + student + " одинаково успешны");
        }
    }
    private int getPover(){
        int i2 = hardworking + loyal + honest;
        return i2;
    }

    public int getHardworking() {
        return hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public int getHonest() {
        return honest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hufflepuff that)) return false;
        if (!super.equals(o)) return false;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }

    public String toStringFullInfo() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
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
