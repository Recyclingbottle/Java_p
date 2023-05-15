package java_11;
import java.util.*;

class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("YOGURT");
        set.add("MILK");
        set.add("BREAD");
        set.add("BUTTER");
        set.add("MILK");
        set.add("BUTTER");
        set.add("CHEESE");
        set.remove("BUTTER");
        
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
