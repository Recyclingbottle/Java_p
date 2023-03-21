package java_02;
public class 책 {
    String 이름;
    String 저자;
    Boolean 대출중;
    
    public void 대여(){
        대출중 = true;
    }
    public void 반납(){
        대출중 = false;
    }
    public void 정보출력(){
        System.out.printf("책 이름 : %s, 저자 : %s, 대출 여부 : %s\n", 이름, 저자, 대출중);
    }
    public static void main( String[] args ) {
        책 책객체 = new 책();
        책객체.이름 = "명품 자바 에센셜";
        책객체.저자 = "황기태";
        책객체.대출중 = false;
        책객체.정보출력();
        책객체.대여();
        책객체.정보출력();
    }
}