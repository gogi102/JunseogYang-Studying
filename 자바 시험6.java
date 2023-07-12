package test;
import java.util.Random;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명? :");
		int student = sc.nextInt();
		int score;
		int cnt = 0;
		for(int i = 1; i <= student; i++ ) {
			System.out.print(i+"번째 점수 입력 :");
			score = sc.nextInt();
			cnt += score;
		}
		System.out.println("총점 :"+cnt);
		System.out.println("평균 :"+cnt/student);
	}

}
