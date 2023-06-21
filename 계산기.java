package wlqrkrhtlvek;
import java.util.Scanner;
public class Tlqkf {

		  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int num1, num2;

	        System.out.print("num1?");
	        num1 = sc.nextInt();
	        System.out.print("num2?");
	        num2 = sc.nextInt();
	       
	        // 사칙연산을 선택하게끔
	        System.out.print("+(1) -(2) *(3) /(4)");
	        int op = sc.nextInt();        
	        double result = 0;
	       
	        // 계산 결과를 출력
	        switch(op) {
	        case 1:
	            result = add(num1, num2);
	            break;
	        case 2:
	            result = 빼기(num1,num2);
	            break;
	        case 3:
	            result = 곱하기(num1,num2);
	            break;
	        case 4:
	            // 더블 = 인트/인트
	            result = 나누기(num1,num2);
	            break;
	        default:
	            System.out.print("응 다시해~");        
	        }
	        System.out.println("결과:"+result);
	    }
	    
	
static int add(int a, int b) {
	int result;
	result = a+b;
	return result;
}		
static int 빼기(int a, int b) {
	int result;
	result = a-b;
	return result;
}		
static int 곱하기(int a, int b) {
	int result;
	result = a*b;
	return result;
}		
static double 나누기(double a, double b) {
	double result;
	result = a/b;
	return result;
}		
}
