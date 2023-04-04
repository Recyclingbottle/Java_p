package java_05.모양;
// import java_05.모양.원;
// import java_05.모양.사각형;
public class 모양테스트 {
    public static void main(String[] args) {
        원 원객체;
        원객체 = new 원();
        원객체.반지름 = 10;
        원객체.이름 = "동전";
        double 원면적 = 원객체.면적계산();
        System.out.println("원면적: " + 원면적);
        사각형 사각객체;
        사각객체 = new 사각형();
        사각객체.너비 = 8;
        사각객체.높이 = 7;
        사각객체.이름 = "메모지";
        int 사각면적 = 사각객체.면적계산();
        
        System.out.println("사각면적: " + 사각면적);
    }
}
    
