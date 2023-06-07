package name;
import java.util.Scanner;
public class YJs {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\r\n"
				+ "███████ ██    ██ ███    ██  ██████  ██ ██           ██████ ███    ██ ███████ ███    ███  █████  \r\n"
				+ "██      ██    ██ ████   ██ ██       ██ ██          ██      ████   ██ ██      ████  ████ ██   ██ \r\n"
				+ "███████ ██    ██ ██ ██  ██ ██   ███ ██ ██          ██      ██ ██  ██ █████   ██ ████ ██ ███████ \r\n"
				+ "     ██ ██    ██ ██  ██ ██ ██    ██ ██ ██          ██      ██  ██ ██ ██      ██  ██  ██ ██   ██ \r\n"
				+ "███████  ██████  ██   ████  ██████  ██ ███████      ██████ ██   ████ ███████ ██      ██ ██   ██ \r\n"
				+ "                                                                                                \r\n"
				+ "                                                                                                \r\n"
				+ "");
		String [][] jari = new String[5][5];
	while(true) {
		System.out.print("1.남은 좌석확인/2.예매하기/3.예매 확인하기/4.종료하기");
		
		int key = sc.nextInt();
		
		switch (key) {
		case 1 :
			System.out.println("----- 남은 좌석 확인하기.-----");
			for(int i = 0; i<jari.length; i++) {
				for(int j = 0; j<jari.length; j++) {
					//System.out.printf("&s",jari[i][j]);
					if(jari[i][j]==null) {
						System.out.printf("□  ");
					}
					else {
						System.out.printf("■  ");
						}
				}
				System.out.println();	
			}
			System.out.println("---------------------------");
			System.out.println();
			break;
		case 2 :
			System.out.println("----- 좌석 예매하기.-----");
			System.out.print("몇행");
			int row = sc.nextInt();
			System.out.print("몇열");
			int col = sc.nextInt();
			if((row >= 0 && row < 5)&&(col >= 0 && col < 5)){
				System.out.print("이름");
				String name = sc.next();
				
				if(jari[row][col]==null) {
					jari[row][col] = name;
					System.out.println("예매가 완료되었습니다");
				}
				else {
					System.out.println("이미 선택된 좌석입니다. 다시 시도해주세요");
					
				}	
			}
			else {
				System.out.println("다시 시도해주세요");
			}
			System.out.println("---------------------------");
			System.out.println();
			break;
		case 3 :
			System.out.println("----- 예매 확인하기.-----");
			System.out.print("예매자 성명을 입력하여 주세요.");
			String name2 = sc.next();
			
			for(int i = 0; i<jari.length; i++) {
				for(int j = 0; j<jari.length; j++) {
					if(jari[i][j]==name2) {
						System.out.println("좌석은"+i+"행"+j+"열 입니다");
					}	
			}
			}		
			System.out.println("---------------------------");
			System.out.println();
			break;
		case 4 :
			System.out.println("----- 프로그램 종료.-----");
			System.out.println("종료됩니다");
			System.exit(0);
			break;
		default :
			System.out.println("----- 요류입니다.재입력 해주세요!-----");
		}
		
	}	
}	
}


