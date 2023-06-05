package java_14;

import java.io.*;
import java.awt.Point;
import java.util.Date;

public class ObjectStreamTest {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("object.bin"));
            Point pt1 = new Point(7, 19);
            Date dt1 = new Date();
            out.writeObject(pt1);
            out.writeObject(dt1);

            in = new ObjectInputStream(new FileInputStream("object.bin"));
            Point pt2 = (Point) in.readObject();
            Date dt2 = (Date) in.readObject();

            System.out.println(pt2);
            System.out.println(dt2);

            out.close();
            in.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 오류");
        }
    }
}
