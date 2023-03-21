public class weeks_02_02 {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2};
        System.out.printf("Swap 전 : a=%d, b=%d\n", arr[0], arr[1]);
        swap(arr);
        System.out.printf("Swap 후 : a=%d, b=%d\n", arr[0], arr[1]);
    }
        static void swap(int[] size2arr){
        int temp = size2arr[0];
        size2arr[0] = size2arr[1];
        size2arr[1] = temp;
    }
}
