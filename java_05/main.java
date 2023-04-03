package java_05;
import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
		
		int arr[];
		System.out.print("정수 몇개?>>");
		int num = scanner.nextInt();
		
		arr = new int[num];
		int count = 0;
		for(int i = 0; i < num; i++) {
			arr[i] = (int)(Math.random()*100 + 1);	//1에서 100까지 난수 생성
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j])		//같은 수가 있으면
					i--;				//난수 다시 만들기
			}
		}
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
			count++;
			if(count % 10 == 0) System.out.println();	//10개 출력 되면 개행
		}
		
		scanner.close();
	
    }
}
