import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		while(cnt < M) {
			int i = (sc.nextInt()-1);
			int j = (sc.nextInt()-1);
			
			while(j>i) {
				int a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;
				j--;
				i++;
			}
			cnt++;
		}
		for(int i=0; i<N ;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
