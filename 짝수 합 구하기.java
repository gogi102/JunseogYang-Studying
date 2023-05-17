package name;
import java.util.Scanner;
public class Name 
{	public static void main(String[] args) 
{	Scanner sc = new Scanner(System.in);
	int sum = 0;
	System.out.print("집 가고싶은 만큼 적어라:");
	int su = sc.nextInt();
	for(int num = 1; num<=su; num++)
{	if(num%2==0) 
{	sum+=num;
}	
}	System.out.println("집 가고싶은 마음:"+sum);	
}	
}
