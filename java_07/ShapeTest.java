package java_07;
abstract class Shape { // 추상 클래스 선언
    public String name;
    public Shape() { name = null; }
    abstract public void draw(); // 추상 메소드 선언
}
public class ShapeTest {
    public static void main(String [] args) {
        Shape s;
        //s = new Shape(); // 컴파일 오류
    }
}
    