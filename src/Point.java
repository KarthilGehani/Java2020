public class Point {
    private int x;
    private int y;
    private String name;
    public Point(){
        x=0;
        y=0;
        name="This is the x "+x+" this is the y "+y;
    }
    public Point(int x1, int y1){

        x=x1;
        y=y1;
        name="this is point"+x+" +"+y;
    }
    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y=y1;
    }
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public void setLocation(int x1, int y1){
        x=x1;
        y=y1;
        name="this is point"+x+" +"+y;
    }
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
        name="this is point"+x+" +"+y;
    }
    public String toString(){
        return name;
    }
}


