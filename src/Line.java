public class Line {
    private Point p1;
    private Point p2;
//    This is a method for point 1 and point 2
    public Line(Point px, Point py) {
        p1 = px;
        p2 = py;
    }
    public Point Getp1(){
        return p1;
    }
    public Point Getp2(){
        return p2;
    }
    public String toString(){
        return "[("+p1.GetX()+" , "+p1.GetY()+" ), ("+p2.GetX()+" , "+p2.GetY()+")]";
    }
//    public double getSlope(){
//        (p2.GetY()-p1.GetY())/(p2.GetX())
//    }

}