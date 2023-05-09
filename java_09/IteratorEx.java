package java_09;

import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(3);
        v.add(7);
        v.add(2);
        
        // Iterator를 사용하여 모든 원소 출력
        Iterator<Integer> it = v.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
            sum += n;
        }
        System.out.println("모든 원소 합: " + sum);
    }
}

