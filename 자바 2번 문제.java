package sdw;
import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;
public class Yjs {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
//2번 문제
System.out.println("시작값");
int start = sc.nextInt();
System.out.println("마지막값");
int last = sc.nextInt();
System.out.println("증가값");
int value = sc.nextInt();
int num = 0;
for(int i = start; i <= last; i+=value ) {
	System.out.println("i: "+i);
	num = num+i;
}
System.out.println(num);






	}

}
