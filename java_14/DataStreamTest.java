package java_14;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        DataInputStream in = null;
        DataOutputStream out = null;

        try {
            out = new DataOutputStream(new FileOutputStream("data.bin"));
            out.writeDouble(7.39);
            out.writeInt(392);
            out.writeChar('한');
            out.writeUTF("자바 연습");

            in = new DataInputStream(new FileInputStream("data.bin"));
            System.out.println(in.readDouble());
            System.out.println(in.readInt());
            System.out.println(in.readChar());
            System.out.println(in.readUTF());

            out.close();
            in.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
