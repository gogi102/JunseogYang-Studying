package sdw;
import java.util.Scanner;
public class Yjs {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
//4번 문제
int python = 0;
for(int java = 1; java <= 20; java++) {
	if(java % 3 == 0) {
		python = python + java;
		
	}
}
System.out.println(python);







	}

}
