import java.util.Scanner;

public class 구구단역순출력 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("출력 단 입력 : ");
        int num = s.nextInt();
        s.close();

        for(int i = 9; i>0;i--)
        {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
