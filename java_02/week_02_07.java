package java_02;
import java.util.Scanner;

public class week_02_07 {
    public static void main(String [] args) {
        int score;
        Scanner s = new Scanner(System.in);
        System.out.print("점수 입력(0 ~ 100) : ");
        score = s.nextInt();
        s.close();
        if( score >= 90 ) {
            System.out.println( "A 등급" );
        }
        else if( score >= 80 ) {
            System.out.println( "B 등급" );
        }
        else if( score >= 70 ) {
            System.out.println( "C 등급" );
        }
        else
        {
            System.out.println( "D 등급" );
        }
    }
}
