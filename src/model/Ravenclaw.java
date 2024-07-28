package model;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private final int wise;
    private final int witty;
    private final int creative;

    public Ravenclaw(String name, String faculty, int transgression, int magicPower, int wise, int witty, int creative) {
        super(name, faculty, transgression, magicPower);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public void likenStudentsRaven(Ravenclaw student){
        if (getPower() > student.getPower()){
            System.out.println(String.format(this + " лучший Когтевранец, чем " + student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format(student + " лучший Когтевранец, чем " + this));
        } else {
            System.out.println("Студенты " + this + " и " + student + " одинаково успешны");
        }
    }
    private int getPower(){
        return wise + witty + creative;
    }

    public int getWise() {
        return wise;
    }
    public int getWitty() {
        return witty;
    }
    public int getCreative() {
        return creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ravenclaw ravenclaw)) return false;
        if (!super.equals(o)) return false;
        return wise == ravenclaw.wise && witty == ravenclaw.witty && creative == ravenclaw.creative;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wise, witty, creative);
    }

    public String toStringFullInfo() {
        return "Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                ", name='" + super.getName() + '\'' +
                ", transgression=" + super.getTransgression() +
                ", magicPover=" + super.getMagicPower() +
                '}';
    }
    @Override
    public String toString() {
        return super.getName()+ " " + super.getFaculty();
    }
}
