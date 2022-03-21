package shapes;

public class ShapeHandler {

    // Returns the sum of the volumes of the given shapes.
    public static double volumeSum(Shape[] shapes) {
        double sum_volume = 0;
        for (Shape shape: shapes)
        {
            sum_volume = sum_volume + shape.volume();
        }

        return sum_volume;
    }

    // Returns the sum of the surface areas of the given shapes.
    public static double surfaceAreaSum(Shape[] shapes) {
        double sum_sa = 0;
        for (Shape shape: shapes)
        {
            sum_sa = sum_sa + shape.surfaceArea();
        }

        return sum_sa;
    }

    public static void main(String[] args) {
        Shape shapes[] = {new Tetrahedron(10), new cylinder(18, 27)};

        System.out.println("The volume of your shapes is " + volumeSum(shapes));
        System.out.println("The volume of your shapes is " + surfaceAreaSum(shapes));
    }
}
