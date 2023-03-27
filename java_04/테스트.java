package java_04;
class 원 {
    public int 반지름;
}
public class 테스트 {
    public static void main(String[] args)
    {
        원 객체 = new 원();

        객체.반지름 = 5;
        증가(객체);
        System.out.printf("값 : %d \n",객체.반지름);

    } 
    static void 증가(원 객체)
    {
        객체.반지름 +=1;
    }
}
