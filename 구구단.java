package name;
import java.util.Scanner;
public class Name {	
public static void main(String[] args) {	
Scanner sc = new Scanner(System.in);

System.out.print("몇단:");
int a = sc.nextInt();

System.out.print("몇곱:");
int b = sc.nextInt();
 for(int i = 2; i <= a; i++) {
	 for(int j = 1; j <= b; j++) {
		 System.out.println(i +"*"+ j +"="+ (i*j));
	 }
	 System.out.println();
 }








	}	
}
