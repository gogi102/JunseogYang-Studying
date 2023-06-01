package test;
import java.util.Random;
import java.util.Scanner;
public class Yjs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("가로");
        int rows = sc.nextInt();
       
        System.out.print("세로");
        int cols = sc.nextInt();
        
        int [] arr = new int[rows*cols];
        
        for(int i = 0; i<arr.length; i++) {
        	arr[i] = rd.nextInt(rows*cols)+1;
        	
        	for(int j = 0; j < i; j++) {
        		if(arr[i]==arr[j]) {
        			i--;
        		}
        	}
        }			
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
			if(k != 0 && k % cols == 0) {
				System.out.println();
		}
		}
        

	}

}
