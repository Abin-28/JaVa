package Area;
public class area 
{
    public static void main(String[] args) {
        shape obj = new shape();

        obj.area(3.0,2.1);
        obj.area(5.5);
        obj.area(8,2);        
    }
}

class shape 
{
    void area(double length, double height) 
    {
        double area = length * height;
        System.out.println("The area of the rectangle is: " + area);
    }

    void area(double radius) 
    {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    void area(int length, int height) 
    {
        double area = 0.5 * length * height;
        System.out.println("The area of the triangle is: " + area);
    }
}