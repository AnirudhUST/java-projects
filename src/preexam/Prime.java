package preexam;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("number:");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				f=1;
				break;
			}
		}

		if(f==0)
		    System.out.println("prime");
		else
			System.out.println("Not");
	}

}
