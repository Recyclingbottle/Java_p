import java.util.Scanner;
public class firstApp {
    public static void main(String[] args){
        int p;
        int n1, n2,n3;

        Scanner s = new Scanner(System.in);
        System.out.print("1번째 값 입력 : ");
        n1 = s.nextInt();
        System.out.print("2번째 값 입력 : ");
        n2 = s.nextInt();
        System.out.print("3번째 값 입력 : ");
        n3 = s.nextInt();

        p = n1 + n2 * n3;
        s.close();

        System.out.println("계산 결과");
        System.out.print(n1 + " + " + n2 + " * "+ n3 + " = " + p);
    }
}
