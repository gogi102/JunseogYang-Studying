package test;
public class Test4 {
	public static void main(String[] args) {
		
		int clap = 0;
		
		for(int i = 1; i <= 40; i++) {
			int num = i;
		
			while(true) {
			
				if(num%10==3||num%10==6||num%10==9) {
					System.out.println(i);
					clap++;
				
					if(num==33||num==36||num==39) {
					
						clap++;
					}
				}			
				
				num = num/10;
				
				if(num==0) {
					break;
			}
			}
		}System.out.println("1 ~ 40까지 박수를 "+clap+"번 쳤음");
	}
}
