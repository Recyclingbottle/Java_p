package java_14;
import java.io.*;

public class BlockBinaryCopy {
    public static void main(String[] args) {
        File src = new File("C:\\Users\\hohol\\Pictures\\Screenshots\\스크린샷 2023-06-05 101027.png");
        File dest = new File("C:\\Users\\hohol\\Pictures\\Screenshots\\test.png");
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024 * 10]; // 10KB 버퍼

            while (true) {
                int n = fi.read(buf); // 버퍼 크기만큼 읽기. n은 읽은 바이트 수
                fo.write(buf, 0, n); // buf[0]부터 n 바이트 쓰기

                if (n < buf.length)
                    break; // 파일 끝에 도달하여 복사 종료
            }

            fi.close();
            fo.close();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
