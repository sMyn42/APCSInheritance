package base.triangle;

public class IsoscelesRightTriangle extends Triangle{

    public IsoscelesRightTriangle (double s) {
        super(s);
    }

    public double area () {
        return 0.5 * Math.pow(getSide(), 2);
    }

    public double perimeter () {
        return (2 + Math.sqrt(2.0)) * getSide();
    }

    public String toString () {
        return "An isosceles right triangle with legs of length " + getSide();
    }

}
