package java_02;



    public class week_02_10 {
        public static void main(String[] args)
        {
            int i = 1; 
            int a = 1;
            while(i < 10)
            {
                System.out.printf("4 ^ %d = ", i);
                for(int k = 0; k<i;k++)
                {
                    if(k==0){
                        System.out.printf("4");
                        a = 4;
                    }    
                    else{
                        System.out.printf("*4");
                        a = a*4;
                    }
                }
                System.out.printf(" = %d \n", a);
                i++;
            }
        }
    }
