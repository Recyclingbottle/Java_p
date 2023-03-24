package java_02;

import java.util.Scanner;

public class week_02_03 {
    public static void main(String[] args)
    {
        int doller, won, charge;
        try (Scanner s = new Scanner(System.in)) {
            System.out.printf("원화(원) : ");
            won = s.nextInt();
        }

        doller = won/1315;
        charge = won%1315;

        System.out.printf(won + "(원) => " + doller + "$ 거스름돈 : " + charge + "원" );
    }
}
