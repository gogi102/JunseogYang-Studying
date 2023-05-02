import java.util.Random;
import java.util.Scanner;
public class Name {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rd = new Random();
	int 소뚜 = rd.nextInt(49)+1;
	int 횟수 = 0;
	System.out.print("몇이 나왔을까?");//입력 받기 전에는 ln보단 그냥 print
	while(true) {
		int a = sc.nextInt();
		횟수++;
		
		if(소뚜<a){
			System.out.println("down");
		}
		else if(소뚜>a) {
			System.out.println("up");
			
		}
		else if(소뚜==a) {
			System.out.println("맞췄습니다 짝짝짝");
			System.out.println(횟수+"번 입력 했음");
			break;}
		else {
			System.out.println("병신");
		}
		
		
	}
	




}

}
