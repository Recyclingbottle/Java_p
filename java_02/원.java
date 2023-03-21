package java_02;
public class 원 {
    int 반지름; 
    String 이름; 
    public double 면적계산() { 
        return 3.14*반지름*반지름;
    }
    public static void main(String[] args) {
        원 작은원; 
        작은원 = new 원(); 
        작은원.반지름 = 10;
        작은원.이름 = "동전"; 
        double 면적 = 작은원.면적계산();
        System.out.println(작은원.이름 + "의 면적은 " + 면적);
    }
}
    