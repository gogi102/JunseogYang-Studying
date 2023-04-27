package name;
import java.util.Scanner;
public class Name {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력해라");
		int num = sc.nextInt();
		int 섬 = 0;
		int i = 1;
		while(true) {
			System.out.print("현재:"+i+" ");
		 섬=섬+i;
		 System.out.println("현재합계:"+섬);
		 i++;
		if(i>num) {
			System.out.println("끝났다");
			break;
		}
	}
		 System.out.println("결과 값:"+섬);
}
}
