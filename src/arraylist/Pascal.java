package arraylist;
import java.util.*;
public class Pascal {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("no of row");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-i;j++) {
				
				
				System.out.println(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print(" "+"*"+" ");
			}
		}
		

	}

}
