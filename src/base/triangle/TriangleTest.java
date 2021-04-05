package base.triangle;

public class TriangleTest {

    public static void main (String[] args) {
        Triangle[] polygonArray = new Triangle[4];
        polygonArray[0] = new IsoscelesRightTriangle(4.0);
        polygonArray[1] = new IsoscelesRightTriangle(6.0);
        polygonArray[2] = new EquilateralTriangle(4.0);
        polygonArray[3] = new EquilateralTriangle(6.0);
        for (Triangle tri: polygonArray){
            System.out.println(tri);
            System.out.println("Area = " + tri.area());
            System.out.println("Perimeter = " + tri.perimeter());
            System.out.println("Ratio = " + tri.ratio());
        }
    }

}
