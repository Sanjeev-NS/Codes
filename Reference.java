class Point 
{
    int x, y;
    Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
public class Reference
{
    public static void main(String[] args) 
    {
        Point point1 = new Point(10, 20);
        System.out.print("Original ");
        point1.display();
        Point point2 = point1;
        point2.x = 30;
        point2.y = 40;
        System.out.print("After modifying point2: \n");
        System.out.print("Point1: ");
        point1.display();
        System.out.print("Point2: ");
        point2.display();
    }
}
