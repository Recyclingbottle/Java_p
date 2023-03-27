package java_04;

class rectangle{
    private int x, y, width, height;
    public rectangle()
    {
        x = y = 0;
        width = height = 1;
    }
    public rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;

        if(width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }
        else{
            System.out.printf("가로,세로길이 오류\n");
            this.width = 1;
            this.height = 1;
        }
    }
    public void set(int x, int y, int width, int height)
    {
        if(width < 0 || height < 0)
        {
            System.out.printf("가로세로 길이 오류\n");
        }
        else{
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }
    public int area()
    {
        int area = width * height;
        return area;
    }
    public void printInfo()
    {
        System.out.printf("[사각형 정보] x: %d, y:%d, width : %d, height : %d \n", x,y,width,height);
        System.out.printf("면적: %d \n", area());
    }
    public boolean equals(rectangle x) {
        if ( (this.width == x.width) && (this.height == x.height) )
            return true;
        else
            return false;
    }
}
public class rectangleTest {
    public static void main(String [] args) {
        rectangle r = new rectangle( );
        rectangle s = new rectangle(1, 2, 10, 15);
        
        r.printInfo();
        s.printInfo();
        
        System.out.println(s.area());
        
        r.set(-3, 2, -1, 4);
        r.printInfo();

        if(r.equals(s))
            System.out.println("두 사각형은 같습니다. ");
        else
            System.out.println("두 사각형은 다릅니다. ");
    }
}
