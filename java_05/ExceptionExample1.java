package java_05;

import java.util.Scanner;

public class ExceptionExample1 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("분자 입력: ");
        int 분자 = s.nextInt();
        
        System.out.print("분모 입력: ");
        int 분모 = s.nextInt();
        
        try{
            System.out.println(분자+ "/" + 분모 + "의 몫: "+ 분자/분모);
        } catch(ArithmeticException e)
        {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("1로 설정합니다.");
            분모 = 1;
            System.out.println(분자+ "/" + 분모 + "의 몫: "+ 분자/분모);
        }finally{
            s.close();
        }
    }
}
