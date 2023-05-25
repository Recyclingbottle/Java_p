package java12;
public class GenericMethodTest {
    public static <T> boolean isEqual(T obj1, T obj2) {
        boolean result = obj1.equals(obj2);
        return result;
    }
    public static void main(String[] args) {
        String java = new String("java");
        String python = new String("python");
        boolean result = GenericMethodTest.<String>isEqual(java, python);
        System.out.println("첫 번째 결과: " + result);

        Integer n1 = 7;
        Integer n2 = 7;
        result = GenericMethodTest.<Integer>isEqual(n1, n2);
        System.out.println("두 번째 결과: " + result);
    }
}