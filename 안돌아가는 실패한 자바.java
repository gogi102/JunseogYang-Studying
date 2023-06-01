package test;
import java.util.Random;
import java.util.Scanner;
public class Yjs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rd = new Random();
       
        // 가로 - 행(row)
        System.out.print("가로?");
        int rows = sc.nextInt();
       
        // 세로 - 열(column)
        System.out.print("세로?");
        int cols = sc.nextInt();
       
        // 배열[행][열]
        int[][] 자리 = new int[rows][cols];
       
        // 랜덤 뽑기
        for(int i=0; i<자리.length; i++) {
            for(int j=0; j<자리[rows-1].length; j++) {
               
                자리[i][j] = rd.nextInt(rows*cols)+1;
               
                // 뽑고 나서 뒤를 돌아보기(지금까지 뽑은 놈을)
                for(int k=0; k<=i; k++) {
                    for(int l=0; l<=cols; l++) {
                        if(i==k && j==l)
                            continue;
                        else if(자리[i][j]==자리[k][l])
                            j--;
                    }
                }
               
            }            
        }
       
        for(int i=0; i<자리.length; i++) {
            for(int j=0; j<자리[rows-1].length; j++) {
                System.out.print(자리[i][j]+"  ");
            }
            System.out.println();
        }

	}

}
