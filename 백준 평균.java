import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float sum = 0;
				
		float[] arr = new float[N];
		
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		
		Arrays.sort(arr);
		
		float M = arr[N-1];
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / M)*100);
		}
		System.out.println(sum / N);
	}
}
