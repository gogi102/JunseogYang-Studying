package test;

public class Test3 {

	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 20; i++) {
			if(i%3==0) {
				a = a+i;
			}
		}
		System.out.println(a);
	}

}
