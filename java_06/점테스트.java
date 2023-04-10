package java_06;
class 점 {
    private int x,y;
    public void 좌표설정(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void 정보출력()
    {
        System.out.println("(" +x + "," + y + ")");
    }
}
class 색상점 extends 점 {
    private String 색상;
    public void 색상설정(String 색상){
        this.색상 = 색상;
    }
    public void 상세정보출력(){
        System.out.print(색상);
        정보출력();
    }
}
public class 점테스트 {
    public static void main(String args[]){
        점 점객체 = new 점();
        점객체.좌표설정(5, 7);
        점객체.정보출력();

        색상점 색점객체 = new 색상점();
        색점객체.좌표설정(2, 9);
        색점객체.색상설정("파랑");
        색점객체.상세정보출력();
    }
}
