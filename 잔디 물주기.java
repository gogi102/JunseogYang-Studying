package test;
import java.util.Scanner;
public class poketmon {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("1");
	float a = sc.nextInt();
	System.out.print("2");
	float b = sc.nextInt();
	float result = 0;
	
	System.out.print("+ 1 - 2 * 3 / 4");
	int op = sc.nextInt();
	switch (op) {
	case 1:
		add(a,b);
		break;

	case 2:
		result = a - b;
		break;
	case 3:
		result = a * b;
		break;
	case 4:
		result = a / b;
		break;	
	default:
		System.out.println("나가");
	}
	System.out.println("값 = "+result);
		}


 void add(int num, int num2) {
	result = num + num2;
}



