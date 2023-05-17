package name;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int baksu = 0;
		int djswpRkwl = sc.nextInt();
		// 369 게임 33,36,39는 짝짝 출력
		for(int i=1; i<=djswpRkwl; i++) {
			
			num = i;
			
			while(true) {
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
					System.out.println(num +": 짝");
					baksu++;
				}
				num = num / 10;
				if(num == 0) {
					break;
				}
				
			}
			
			
		}
			System.out.println("1~"+djswpRkwl+"까지의 총 박수:"+baksu);
	}	

}

