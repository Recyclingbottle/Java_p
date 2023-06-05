package java_14;

import java.io.File;

public class FileClassEx {
    public static void main(String[] args) {
        File f = new File("C:/Users/hohol/내 드라이브/Vscode/HW3");
        String[] filenames = f.list();

        if (filenames != null) {
            for (int i = 0; i < filenames.length; i++) {
                File sf = new File(f, filenames[i]);
                System.out.print(filenames[i]);
                System.out.print("\t파일 크기: " + sf.length());
                System.out.println();
            }
        } else {
            System.out.println("디렉토리가 비어있습니다.");
        }
    }
}
