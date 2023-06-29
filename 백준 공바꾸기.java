import java.util.Scanner;
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = i;
		}
		for(int a=0; a<m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int b = arr[i];
			
			arr[i] = arr[j];
			arr[j] = b;
		}
		for(int i=1; i<=n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
