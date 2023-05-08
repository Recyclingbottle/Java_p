package java_09;

class Rect {
    int width, height;
    
    public Rect(int width, int height) {
        this.width = width; this.height = height;
    }
}
public class ObjectPropertyEx {
    public static void main(String [] args) {
        Rect p = new Rect(15,20);
        System.out.println(p.getClass().getName()); // 클래스 이름
        System.out.println(p.hashCode()); // 해시 코드 값
        System.out.println(p.toString()); // 객체의 문자열
    }
}
    