package java_11;
import java.util.*;
public class HashMapTermEx {
        public static void main(String[] args) {
            HashMap<String, String> term = new HashMap<String, String>();

            // 3개 원소 저장
            term.put("binary", "2진법");
            term.put("octal", "8진법");
            term.put("decimal", "10진법");
            term.put("hexadecimal", "16진법");
            term.put("byte", "바이트");
            term.put("bit", "비트");
            term.put("algorithm", "알고리즘");
            term.put("variable", "변수");
            term.put("function", "함수");
            term.put("loop", "반복문");
            // 모든 (key, value) 쌍 출력
            Set<String> keys = term.keySet(); // Set 리턴
            Iterator<String> it = keys.iterator();
            while(it.hasNext()) {
                String key = it.next();
                String value = term.get(key);
                System.out.println("(" + key + ", " + value + ")");
            }
        }
}
