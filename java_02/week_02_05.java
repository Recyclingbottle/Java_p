import java.util.Scanner;

public class week_02_05 {
    public static void main(String[] args)
    {
        int 입력;
        boolean 결과;
        Scanner s = new Scanner(System.in);
        System.out.print("1개의 정수 입력? ");
        입력 = s.nextInt();
        s.close();
        결과 = 입력%2==0;
        System.out.println(입력 + ": " + 결과);
    }
}
