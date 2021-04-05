package base.triangle;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle (double s) {
        super(s);
    }

    public double area () {
        return (Math.sqrt(3) / 4) * Math.pow(getSide(), 2);
    }

    public double perimeter () {
        return 3 * getSide();
    }

    public String toString () {
        return "An equilateral triangle with sides of length " + getSide();
    }

}
