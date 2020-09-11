public class TestProgram
{
    public static void main(String[] args) {
        Rectangle Rectangle1 = new Rectangle(4.0, 40.0);
        Rectangle Rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The area of a rectangle with width 4.0 and height 40.0 is " + Rectangle1.getArea());
        System.out.println("The perimeter of this rectangle is " + Rectangle1.getPerimeter());
        System.out.println("The area of a rectangle with width 3.5 and height 35.9 is " + Rectangle2.getArea());
        System.out.println("The perimeter of this rectangle is " + Rectangle2.getPerimeter());
    }
}
