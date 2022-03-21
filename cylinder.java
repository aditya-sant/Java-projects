package shapes;

public class cylinder implements Shape
{

    double radius, height;

    public cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return (Math.PI * (Math.pow(radius, 2)) * height);
    }

    @Override
    public double surfaceArea()
    {
        return ((2 * Math.PI * radius * height) + (2 * Math.PI * (Math.pow(radius, 2))));
    }
}
