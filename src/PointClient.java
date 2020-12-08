//This is the client class
//you will create the objects from here
//this one wi;ll
public class PointClient {
    public static void main(String[] args) {
        Point p1= new Point();
        Point p2 = new Point(3,2);
        p2.SetY(5);
        System.out.println("The point is p1; ("+p1.GetX()+","+p1.GetY()+")");
        System.out.println("The point is p1; ("+p2.GetX()+","+p2.GetY()+")");
        p1.setLocation(-5,6);
        System.out.println("The point is p1; ("+p1.GetX()+","+p1.GetY()+")");
        Line line1 = new Line(p1, p2);
        System.out.println(line1);
        System.out.println(p1);
        Rectangle r1 = new Rectangle(3,5,10,8);
        Rectangle r2 = new Rectangle(5, 4, -2,4);
        System.out.println(r1);
        System.out.println(r2);
        Point[] pointies;

//        pointies[0]
    }
}
