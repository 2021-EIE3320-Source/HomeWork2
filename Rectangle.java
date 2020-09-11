public class Rectangle
{
    // instance variables - replace the example below with your own
    private double width;
    private double height;
    public Rectangle()
    {
        width = height = 1;
    }

    public Rectangle(double Width, double Height)
    {
        width = Width;
        height = Height;
    }
    public double getArea()
    {
        return width * height;
    }
    
    public double getPerimeter()
    {
        return (width + height) * 2;
    }
}
