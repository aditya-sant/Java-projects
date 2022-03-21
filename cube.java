package shapes;

public class cube implements Shape
{
    double edge;

    public cube(double edge)
    {
        this.edge = edge;
    }

    @Override
    public double volume()
    {
        return (Math.pow(edge, 3));
    }

    @Override
    public double surfaceArea()
    {
        return (6 * (Math.pow(edge, 2)));
    }
}
