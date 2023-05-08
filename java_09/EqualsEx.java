package java_09;

class Rect {
    int width, height;
    
    public Rect(int width, int height) {
        this.width = width; 
        this.height = height;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rect) {
            Rect p = (Rect)obj;
            if (width == p.width && height == p.height) 
                return true;
        }
        return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(15,20);
        Rect b = new Rect(15,20);
        Rect c = new Rect(20,30);
        
        if (a == b) 
            System.out.println("a==b");
        if (a.equals(b)) 
            System.out.println("a is equal to b");
        if (a.equals(c)) 
            System.out.println("a is equal to c");
    }
}
