package java_13;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEX {
    public static void main(String args[]){
        try {
            FileOutputStream fout = new FileOutputStream("C:/Users/hohol/내 드라이브/Vscode/java_13/test.bin");
            int num[]={1, 4, -1, 88, 50};
            byte b[]={7, 51, 3, 4, 1, 24};
            
            for(int i=0; i<num.length; i++)
                fout.write(num[i]); 
            
            fout.write(b); 
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

