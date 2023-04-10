package java_06;
class 자동차 {
    public 자동차() {
        System.out.println("자동차");
    }
    public 자동차( int 숫자 ) {
        System.out.println("자동차(숫자)");
    }
}
class 승용차 extends 자동차 {
    public 승용차() {
        System.out.println("승용차");
    }
    public 승용차( int 숫자 ) {
        super(숫자);
        System.out.println("승용차(숫자)");
    }
}
class 택시 extends 승용차 {
    public 택시() {
        System.out.println("택시");
    }
    public 택시( int 숫자 ) {
        super(숫자);
        System.out.println("택시(숫자)");
    }
}
    
public class 자동차테스트 {
    public static void main(String [] args) {
        택시 택시객체 = new 택시(3);
    }
}
