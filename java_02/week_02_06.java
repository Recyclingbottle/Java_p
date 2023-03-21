import java.util.Scanner;
public class week_02_06 {
    public static void main(String [] args) {
        int time;
        Scanner s = new Scanner(System.in);
        System.out.print("등교시간(08:30은 830으로 입력)? ");
        time = s.nextInt();
        s.close();
        if(time >= 900) {
            System.out.println("지각");
        }
        else{
            System.out.println("좋은 아침");
        }
    }
}

