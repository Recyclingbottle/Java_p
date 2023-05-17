package java_11;
import java.util.*;

public class CollectionsEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator =l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = " -> ";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
        System.out.println("");
}

public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<String>();
    myList.add("사과");
    myList.add("바나나");
    myList.add("포도");

    myList.add(0,"망고");
    myList.add(2,"감귤");

    Collections.sort(myList); // 정렬
    printList(myList);
    
    Collections.reverse(myList); // 역순
    printList(myList);

    int index = Collections.binarySearch(myList, "사과") + 1;
    System.out.println("사과는 " + index + "번째 원소입니다.");
    }
}
