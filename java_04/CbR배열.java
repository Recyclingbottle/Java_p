package java_04;

public class CbR배열 {
    public static void main(String[] args)
    {
        int [] 배열 = {1,2,3,4,5};
        증가(배열);
        for(int n= 0; n<배열.length;n++)
        {
            System.out.printf("[%d] %d \n",n,배열[n]);
        }
        
    }
    static void 증가(int [] 배열)
        {
            for(int n = 0; n<배열.length;n++){
                배열[n] +=1;
            }
        }
}
