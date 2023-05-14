import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int rra [] = new int[n];
		int m = sc.nextInt();
		for(int a = 0; a < m; a++) {
			
				int i = sc.nextInt();
		    int j = sc.nextInt();   
		    int k = sc.nextInt();
		    
			for(int b = i-1; b < j; b++) {
			    	rra[b] = k;
			    }
		}
		for(int K = 0; K < rra.length; K++) {
		    System.out.print(rra[K]+" ");
		}
	}
}
