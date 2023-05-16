package sdw;
import java.util.Scanner;
public class Yjs {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
//1번 문제
	System.out.print("체중");
	float Weight = sc.nextFloat();
	
	System.out.print("키");
	float key = sc.nextFloat();

	float bmi = Weight/(key*key);
	
	if(bmi < 18.5) {
		System.out.println("저체중");
	}
	else if(bmi >= 18.5 && bmi <= 24.9) {
		System.out.println("건강");
	}
	else if(bmi >= 25 && bmi <= 29.9) {
		System.out.println("과체중");
	}
	else if(bmi <= 30 ) {
		System.out.println("비만");
	}

	else {
		System.out.println("뭔가 이상함 다시 ㄱㄱ");
	}










	}

}
