package java_04;

import java.util.Scanner;

public class 홀짝판정 {
    public static boolean checkEven(int num) {
        return ((num % 2) == 0);
    }

    public static void main(String args[]) {
        int 입력;
        boolean 결과;

        Scanner s = new Scanner(System.in);
        System.out.print("1개의 정수 입력? ");
        입력 = s.nextInt();
        s.close();
        결과 = checkEven(입력);
        if (결과) {
            System.out.println(입력 + ": 짝수");
        } else {
            System.out.println(입력 + ": 홀수");
        }
    }
}

