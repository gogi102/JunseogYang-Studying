package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("------------------------------");
			System.out.println("계산기 프로그램");
			System.out.println("1.계산기 실행,2.종료");
			int choice = sc.nextInt();
			System.out.println("------------------------------");
			if(choice==1) {
				System.out.println("계산기 실행");
				
				System.out.print("수 입력해봐");
				int a = sc.nextInt();
				
				System.out.print("두 번째 수 입력해봐");
				int b = sc.nextInt();
				
				System.out.print("+,/,-,*");
				String c = sc.next();
				switch (c) {
				case "+":
					System.out.println(a+""+c+""+b+"의 결과는"+(a+b));
					break;

				case "-":
					System.out.println(a+""+c+""+b+"의 결과는"+(a-b));		
					break;
				case "*":
					System.out.println(a+""+c+""+b+"의 결과는"+(a*b));
					break;
				case "/":
					System.out.println(a+""+c+""+b+"의 결과는"+(a/b));
					break;
				default:
					break;
				}
				
				
				
				
				
				
				
				
				
				
			}
			else if(choice==2) {
				System.out.println("종료합니다");
				break;
			}
			
			else {
				System.out.println("다시 입력해");
			}
		}
	}
}

			

		
