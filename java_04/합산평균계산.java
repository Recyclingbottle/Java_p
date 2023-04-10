package java_04;

import java.util.Scanner;

public class 합산평균계산 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int [] 배열 = new int[5];
        int sum =0;
        for(int i = 0; i<5;i++)
        {
            System.out.printf("정수 입력? ");
            int n = s.nextInt();
            배열[i] = n;
            sum += n;
        }
        System.out.printf("합산결과 : %d\n", sum);
        System.out.printf("평균 : %d\n", sum/5);
        s.close();
    }
}
