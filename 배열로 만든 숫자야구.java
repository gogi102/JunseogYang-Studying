package name;

import java.util.Random;
import java.util.Scanner;

public class Hjs {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random  random = new Random();
		
		
//		int a = random.nextInt(9)+1;
//		int b = random.nextInt(9)+1;
//		int c = random.nextInt(9)+1;

		int[] arr = new int[3];
		
		
		while(arr[0]==arr[1]||arr[1]==arr[2]||arr[0]==arr[2]) {
			for(int i = 0; i<arr.length; i++ ) {
				arr[i] = random.nextInt(9)+1;
			}
		}
		
		int[] jyt = new int[3];
		int num;
		int s = 0 ;
		int b = 0 ;
		
		while(s!=3) {
			System.out.println("숫자 3개 입력");
			num = scanner.nextInt();
			s = 0;
			b = 0;
			if(num>999) {
				System.out.println("naga");
			}
			else {
				for(int k = jyt.length-1; k>=0; k--) {
					jyt[k] = num % 10;
					num = num / 10;
					
				}
				 // 자바 잘한다
			
				if(arr[0]==jyt[0])s++;
				else if(arr[1]==jyt[1])s++;
				else if(arr[2]==jyt[2])s++;
		
				if(jyt[0]==arr[0]||jyt[0]==arr[2])b++;
				if(jyt[1]==arr[0]||jyt[1]==arr[2])b++;
				if(jyt[2]==arr[0]||jyt[2]==arr[1])b++;
				
		
		System.out.println("스트라이크:"+s);
		System.out.println("볼:"+b);	
		if(s==3)System.out.println("성공");
		}
	
		
		
		}		
		

	}
}
