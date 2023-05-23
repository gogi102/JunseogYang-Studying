package Main;
import java.util.Scanner;
public class Name {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 

         System.out.print("수 입력:");
		 int a = sc.nextInt();
		 int b = 0;
		 int c = 0;
		 
		 for(int i = 0; i <= a; i++) {
			if(i%2==0) {
				b+=i;	
			}else if(i%2!=0) {
				c+=i;
			}
		 }
		 System.out.println("짝수합:"+b+"홀수합"+c);
	
	}
	
}
