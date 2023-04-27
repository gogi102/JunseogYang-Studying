package yks;

import java.util.Scanner;

public class Yjs {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("라면 끓이기!");
	
	System.out.println("가스레인지 앞에 섰다");
	System.out.println("1.불을 킨다.   2.귀찮다.");
	int ㄻ = sc.nextInt();
	if (ㄻ==1) {
		System.out.println("불 켜짐");
		System.out.println("보글보글 물 끓음");
		System.out.println("1.다 넣는다   2.귀찮다 끓이지 말자");
		int ㄻ2 = sc.nextInt();
		if(ㄻ2==1) {
			System.out.println("잘 끓었다");
			System.out.println("이제 처 먹자");
		                          }
		else if(ㄻ2==2)
			System.out.println("생라면 먹방 ㄱㄱ");
		else {
			System.out.println("1,2 중에 하나만 입력해 눈치 것");
		}
		}
		
		else if(ㄻ==2) { System.out.println("생라면 먹방 ㄱㄱ");
	}
	else {
		System.out.println("1,2 중에 하나만 입력해 눈치 것");
	}
	
	
	
	
	
	}
		
		
		}


