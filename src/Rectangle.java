public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(int x1, int y1, int width1, int height1){
       if (width1 >= 0 && height1 >= 0) {
           x = x1;
           y = y1;
           width = width1;
           height = height1;
       }
       else {
           throw new IllegalArgumentException();
       }
    }
    public void SetX(int x1){
        x=x1;
    }
    public void SetY(int y1){
        y=y1;
    }
    public void Setwidth(int width1){
        width=width1;
    }
    public void Setheight(int height1){
        height=height1;
    }
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public int GetHeight(){
        return height;
    }
    public int GetWidth(){
        return width;
    }
    public String toString() {
        return "Rectangle[x="+x+",y="+y+",width="+width+", height="+height+"]";
    }
//    public double getSlope(){
//        (
//    }
}

