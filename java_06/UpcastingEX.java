package java_06;

class Shape{
    protected int x,y;

    public void ShowInfo(){}
}
class Circle extends Shape {
    protected int radius;
    public void ShowDetailInfo(){}
}

public class UpcastingEX {
    public static void main(String[] args){
        Shape s_obj;
        Circle c_obj = new Circle( );
        s_obj = c_obj; // 업캐스팅
        s_obj.x = 10;
        s_obj.y = 15;
        c_obj.radius =10;
        Circle nc_obj = (Circle)s_obj; // 다운캐스팅
        nc_obj.radius = 7;
    }
}
