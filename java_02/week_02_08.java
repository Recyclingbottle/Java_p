import java.util.Scanner;

public class week_02_08 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수? ");
        int 정수 = s.nextInt();
        s.close();
        
        if( 정수 >= 1000 )
            System.out.println( "큰 수" );
        else if( 정수 >= 100 )
            System.out.println( "3자리 수" );
        else if( 정수 >= 10 )
            System.out.println( "2자리 수" );
        else if( 정수 >= 0 )
            System.out.println( "1자리 수" );
        else
            System.out.println( "음수" );
    }
        
}
