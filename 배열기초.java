import java.util.Random;
import java.util.Scanner;
public class Name {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rd = new Random();
//int[]a = new int[100];
int[]a = new int[5];
int 엿 = 0;
while(엿<5) {
	
	System.out.print("값을 입력하세요!");
	a[엿]=sc.nextInt();
	엿++;


}


for(int 영원 = 0;영원<5;영원++) {
	System.out.println(a[영원]);
	
}


}
