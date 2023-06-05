package java_14;

import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("C:\\Users\\hohol\\Pictures\\Screenshots\\스크린샷 2023-06-05 101027.png");
        File dst = new File("C:\\Users\\hohol\\Pictures\\Screenshots\\test.png");
        int c;

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dst);

            while ((c = fi.read()) != -1) {
                fo.write((byte) c); //char -> byte
            }

            fi.close();
            fo.close();

            System.out.println(src.getPath() + "를 " + dst.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
