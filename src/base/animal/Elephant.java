package base.animal;

public class Elephant extends Herbivore{

    private double tuskLengthMeters;

    public Elephant (String n, double tuskLengthM) {
        super("elephant", n);
        tuskLengthMeters = tuskLengthM;
    }

    @Override
    public String toString() {

        return super.toString() + " with tusks " + tuskLengthMeters + " meters long";

    }

}
