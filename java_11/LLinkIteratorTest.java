package java_11;
import java.util.*;

public class LLinkIteratorTest {
    public static void main(String [] args) {
        LinkedList<String> llink = new LinkedList<String>();
        
        llink.add("MILK");
        llink.add("BREAD");
        llink.add("BUTTER");
        llink.add(1, "APPLE");
        llink.set(2, "GRAPE");
        llink.remove(3);

        Iterator<String> it = llink.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
