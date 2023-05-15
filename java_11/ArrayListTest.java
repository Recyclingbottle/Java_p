package java_11;
import java.util.Random;
import java.util.ArrayList;

public class ArrayListTest {
    public static void print(ArrayList<Integer> v) {
        for(int n=0; n<v.size(); n++) {
            int val = v.get(n);
            System.out.print(val + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        ArrayList<Integer> v = new ArrayList<>();
        int sum = 0;
        double aver = 0.0;
        Random r = new Random();
        for(int i  = 0 ; i< 12; i++){
            v.add(r.nextInt(100));
        }

        System.out.println("전 : ");
        // for(int i = 0; i < v.size(); i++){
        //     int val = v.get(i);
        //     System.out.print(val + " ");
        // }
        // System.out.println(" ");
        print(v);
        v.remove(5);
        v.remove(2);

        System.out.println("후 : ");
        // for(int i = 0;i < v.size(); i++){
        //     int val = v.get(i);
        //     System.out.print(val + " ");
        // }
        // System.out.println(" ");
        print(v);

        v.set(0, r.nextInt(100));
        v.set(7,r.nextInt(100));
        System.out.println("위치 변경 후 ");
        // for(int i = 0; i < v.size(); i++){
        //     int val = v.get(i);
        //     System.out.print(val + " ");
        // }
        // System.out.println(" ");
        print(v);
            
        for(int i = 0; i < v.size(); i++){
            int val = v.get(i);
            sum += val; 
        }
        System.out.println(" ");
        aver = (double)sum / v.size();
        System.out.println("합 : " + sum);
        System.out.println("평균 " + aver);
    }
}
