package java_14;

import java.io.*;

public class BufferedIOEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedOutputStream out = new BufferedOutputStream(System.out, 5);

        try {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            out.flush(); // 버퍼 비움

            if (in != null) {
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
