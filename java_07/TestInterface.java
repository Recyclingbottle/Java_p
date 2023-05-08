package java_07;
interface RemoteControl {
        void turnOn();
        void turnOff();
    public default void printBrand(){ 
            System.out.println("Remote Control 가능 TV"); }
}
class Television implements RemoteControl {
    boolean on;
    public void turnOn() {
            on = true;
            System.out.println("TV가 켜졌습니다.");
    }
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }
    @Override
    public void printBrand() {
            System.out.println("Power Java TV입니다."); 
    }
}
public class TestInterface {
    public static void main(String args[]){
            RemoteControl obj = new Television();
            obj.turnOn();
            obj.turnOff();
            obj.printBrand();
    }  
}
