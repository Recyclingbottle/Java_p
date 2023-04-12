package java_06;
class Shape {
    protected String name;
    protected int x, y;

    public Shape() {
        this("도형", 0, 0);
    }

    public Shape(String name) {
        this(name, 0, 0);
    }

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void ShowInfo() {
        System.out.printf("==============\n이름 : %s\n 좌표 : %d, %d\n", name, x, y);
    }
}

class Rectangle extends Shape {
    protected int width, height;

    public Rectangle() {
        super("사각형", 0, 0);
        this.width = this.height = 0;
    }

    public Rectangle(String name) {
        super(name, 0, 0);
        this.width = this.height = 0;
    }

    public Rectangle(String name, int x, int y, int width, int height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("너비, 높이: %d, %d \n", width, height);
    }
}

class Circle extends Shape {
    protected int radius;

    public Circle() {
        super("원");
        radius = 0;
    }

    public Circle(String name) {
        super(name);
        radius = 0;
    }

    public Circle(String name, int x, int y, int radius) {
        super(name, x, y);
        this.radius = radius;
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("반지름: %d \n", radius);
    }
}

class Sphere extends Circle {
    protected int z;

    public Sphere() {
        super("구");
        this.z = 0;
    }

    public Sphere(String name, int x, int y, int z, int radius) {
        super(name, x, y, radius);
        this.z = z;
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("좌표(z축): %d \n", z);
    }
}

class Box extends Rectangle {
    protected int z;
    protected int depth;

    public Box() {
        super("육면체");
        this.z = 0;
        this.depth = 0;
    }

    public Box(String name, int x, int y, int z, int width, int height, int depth) {
        super(name, x, y, width, height);
        this.z = z;
        this.depth = depth;
    }

    public void ShowInfo() {
        super.ShowInfo();
        System.out.printf("좌표(z축): %d \n", z);
        System.out.printf("깊이: %d \n", depth);
    }

}
public class ShapeTest {
    public static void main(String args[]) {
        Shape s_obj = new Shape();
        s_obj.ShowInfo();

        Circle c_obj2 = new Circle("동전", 5, 3, 4);
        c_obj2.ShowInfo();

        Rectangle r_obj = new Rectangle("타일", 7, 5, 11, 13);
        r_obj.ShowInfo();

        Sphere s_obj2 = new Sphere("공", 9, 9, 5, 8);
        s_obj2.ShowInfo();

        Box b_obj1 = new Box();
        b_obj1.ShowInfo();

        Box b_obj2 = new Box("책", 1, 3, 7, 7, 13, 11);
        b_obj2.ShowInfo();
    }
}

