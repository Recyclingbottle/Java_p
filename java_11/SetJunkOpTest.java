package java_11;
import java.util.*;
public class SetJunkOpTest {
    public static void main(String [] args) {
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();

        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set2.add("Cheese");
        set2.add("Ham");
        set2.add("Bread");

        HashSet<String> union = new HashSet<String>(set1);
        union.addAll(set2);

        HashSet<String> inter = new HashSet<String>(set1);
        inter.retainAll(set2);
        
        System.out.println("합집합: " + union);
        System.out.println("교집합: " + inter);
    }
}
