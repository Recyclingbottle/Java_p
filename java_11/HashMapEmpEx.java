package java_11;
import java.util.*;
class Employee {
    int id;
    String dept;
    public Employee(int id,String dept) {
        this.id = id;
        this.dept = dept;
    }
}

public class HashMapEmpEx {
    public static void main(String[] args) {
        HashMap<String, Employee> map =
        new HashMap<String, Employee >();

        map.put("Lee", new Employee(101,"sales"));
        map.put("Park", new Employee (102,"personnel"));
        map.put("Kim", new Employee (103,"planning"));

        System.out.println("원소 개수: "+ map.size());
        Set<String> names = map.keySet();
        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String name = it.next();
            Employee emp = map.get(name);
            System.out.println(name + ": "+ emp.id + " " + emp.dept);
        }
    }
        
}
