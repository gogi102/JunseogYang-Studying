package name;
import java.util.Random;
import java.util.Scanner;
public class YJs {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        Random rd = new Random();
	       
	        System.out.print("가로?"); // 3
	        int rows = sc.nextInt();
	       
	        System.out.print("세로?"); // 5
	        int cols = sc.nextInt();
	       
	        int[] 자리 = new int[rows*cols]; // 15
	       
	        for(int i=0; i<자리.length; i++) {
	            자리[i] = rd.nextInt(rows*cols)+1;
	                    // 0~rows*cols-1 +1 --> 1~rows*cols
	            for(int j=0; j<i; j++) {
	                if(자리[i] == 자리[j])
	                    i--;
	            }
	        }
	        //  가로 3 * 세로 17
	        //  1  2  3  4  17 엔터
	        //  6  7  8  9  34 엔터
	        //  11 12 13 14 51
	       
	        for(int i=0; i<자리.length; i++) {
//	            System.out.print(자리[i]+" ");
	            System.out.printf("%5d	", 자리[i]);
	            if(i!=0 && (i+1)%cols==0)
	                System.out.println();
	        }
	       
		sc.close();
	}

}
