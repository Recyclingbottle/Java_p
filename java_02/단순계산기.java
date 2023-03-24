package java_02;

import java.util.Scanner;

public class 단순계산기 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int 연산자, 피연산자1, 피연산자2, 결과=0;
        System.out.print("연산자(+:1, -:2, *:3, /:4): ");
        연산자 = s.nextInt();
        System.out.print("첫 번째 피연산자: ");
        피연산자1 = s.nextInt();
        System.out.print("두 번째 피연산자: ");
        피연산자2 = s.nextInt();
        s.close();
        if( 연산자 == 1 )
            결과 = 피연산자1 + 피연산자2;
        else if( 연산자 == 2 )
            결과 = 피연산자1 - 피연산자2;
        else if( 연산자 == 3 )
            결과 = 피연산자1 * 피연산자2;
        else if( 연산자 == 4 )
            결과 = 피연산자1 / 피연산자2;
        System.out.println("연산결과: " + 결과);
        }
        
}
