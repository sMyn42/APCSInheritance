package base.triangle;

public abstract class Triangle {

    private double side;

    public Triangle(double s) {
        this.side = s;
    }

    public abstract double area ();

    public abstract double perimeter ();

    public double ratio () {
        return this.area()/this.perimeter();
    }

    public double getSide () {
        return this.side;
    }

}
