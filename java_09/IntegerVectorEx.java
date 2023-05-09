package java_09;

import java.util.ArrayList;

public class IntegerVectorEx {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(3);
        v.add(7);
        v.add(2);
        int sum = 0;
        for(int i=0; i<v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
            sum += n;
        }
        System.out.println("모든 원소 합: " + sum);
        
        ArrayList<Integer> v2 = new ArrayList<Integer>(3);
        v2.add(new Integer(7));
        v2.add(3);
        v2.add(-5);
        v2.add(19);
        v2.add(5, 17);
        v2.add(2, 31);
        v2.set(1, -5);
        v2.set(4, 7);
        Integer nObj = v2.get(3);
        int n = nObj.intValue();
        int m = v2.get(0);
        v2.remove(new Integer(-5));
        v2.remove(1);
        n = v2.indexOf(new Integer(7));
        m = v2.lastIndexOf(new Integer(7));
        v2.clear();
        
        // 결과 확인
        System.out.println(v2); // 빈 리스트 출력
        System.out.println("nObj: " + nObj + ", n: " + n + ", m: " + m); // nObj: 19, n: 3, m: -1
        System.out.println("v: " + v); // v: [3, 7, 2]
        System.out.println("v2: " + v2); // v2: []
    }
}