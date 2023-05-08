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
        
        원 큰원; // 
        큰원 = new 원(); // 원 객체 생성 
        큰원.반지름 = 90; // 반지름을 90으로 설정
        큰원.이름 = "바퀴"; // 이름 설정
        double 면적2 = 큰원.면적계산();
        double 면적 = 작은원.면적계산();
        System.out.println(작은원.이름 + "의 면적은 " + 면적);
        System.out.println(큰원.이름 +  "의 면적은 " + 면적2);

        원 다른원;
        다른원 = 작은원;
        큰원 = 작은원; 
        double 면적3 = 큰원.면적계산();
        double 면적4 = 작은원.면적계산();
        System.out.println(작은원.이름 + "의 면적은 " + 면적3);
        System.out.println(큰원.이름 +  "의 면적은 " + 면적4);
    }
}
    