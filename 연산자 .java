package yks;

import java.util.Scanner;

public class Yjs {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("수 입력1:");
	int a = sc.nextInt();
	System.out.println("수 입력2:");
	int b = sc.nextInt();

   System.out.println("+,-,*,/중 하나를 입력해");
   String 연산자 = sc.next();
   switch (연산자) {
   
   case "+":
	  System.out.println(a + b);
	  break;
   case "-":
	   System.out.println(a - b);
		  break;
   case "*":
	   System.out.println(a * b);
		  break;
   case "/":
	   System.out.println(a / b);
		  break;
   default:
   System.out.println("똑바로 입력해");
   
}
	
	
	
	}
		
		
		}


