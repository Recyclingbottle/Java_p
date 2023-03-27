package java_04;

public class 간단한계산기 {
    public int 덧셈(int 입력1, int 입력2)
    {
        int 결과;
        결과 = 입력1 + 입력2;
        return 결과;
    }
    public double 덧셈(double 입력1, double 입력2)
    {
        double 결과;
        결과 = 입력1 + 입력2;
        return 결과;
    }
    public int 덧셈(int 입력1, int 입력2, int 입력3)
    {
        int 결과;
        결과 = 입력1 + 입력2 + 입력3;
        return 결과;
    }
    public double 덧셈(double 입력1, double 입력2, double 입력3)
    {
        double 결과;
        결과 = 입력1 + 입력2 + 입력3;
        return 결과;
    }
    public static void main(String[] args)
    {
        간단한계산기 객체;
        객체 = new 간단한계산기();
        int 정수결과 = 객체.덧셈(3,4);
        double 실수결과 = 객체.덧셈(3.5,4.7);

        int 정수결과2 = 객체.덧셈(3,4,5);
        double 실수결과2 = 객체.덧셈(3.5,4.7,5.2);

        System.out.printf("%d + %d = %d \n", 3,4,정수결과);
        System.out.printf("%.1f + %.1f = %.1f \n", 3.5,4.7,실수결과);

        System.out.printf("%d + %d + %d = %d \n", 3,4,5,정수결과2);
        System.out.printf("%.1f + %.1f + %.1f = %.1f \n", 3.5,4.7,5.2,실수결과2);
    }
}
