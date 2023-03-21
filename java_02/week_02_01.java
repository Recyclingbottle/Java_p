public class weeks_02_01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.printf("Swap 전 : a=%d, b=%d\n", a, b);
        swap(a, b);
        System.out.printf("Swap 후 : a=%d, b=%d\n", a, b);
    }
        static void swap(int v1, int v2){
        int temp = v1;
        v2 = v1;
        v1 = temp;
    }
        
}
