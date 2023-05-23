package Main;
import java.util.Random;
import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random  random = new Random();
		
		int a = random.nextInt(9)+1;
		int b = random.nextInt(9)+1;
		int c = random.nextInt(9)+1;
	
		while(a == b || b == c || a == c) {
			a = random.nextInt(9)+1;
		    b = random.nextInt(9)+1;
			c = random.nextInt(9)+1;
		}
		System.out.print("숫자 3개 입력:");
		int jyt = scanner.nextInt();
		
		if(jyt>999) {
			System.out.println("다시 나가");
		}else {
			int t = jyt % 10;
			jyt = jyt / 10;
			int y = jyt % 10;
			jyt = jyt / 10;
			int j = jyt % 10;
			jyt = jyt / 10;
			int strike = 0;
			int ball = 0;
			
			if(a == j) strike ++;
			if(b == y) strike ++;
			if(c == t) strike ++;
		}
	}
	
}
