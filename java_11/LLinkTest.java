package java_11;
import java.util.LinkedList;
public class LLinkTest {
    public static void main(String [] args) {
        LinkedList<String> llink = new LinkedList<String>();
        
        llink.add("MILK");
        llink.add("BREAD");
        llink.add("BUTTER");

        llink.add(1, "APPLE");
        llink.set(2, "GRAPE");
        llink.remove(3);

        for(int n=0; n<llink.size(); n++) {
            System.out.println(llink.get(n));
        }
    }
        
}
