package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
	//구구단 구구단 구구단 구구단 구구단 구구단 구구단 구구단 구구단 구구단 구구구구구
	
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단 입력 할거야");
		int b =1;
		int a = sc.nextInt();
		for(b=1;b<=9;b++) {
			System.out.println(a+"*"+b+"="+(a*b));
		}
		

	}

}
