package preexam;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,n;
		int count=2;
		Scanner s=new Scanner(System.in);
		System.out.println("no:");
		n=s.nextInt();
		System.out.print(f1+" "+f2);// 1st two elements
		int temp;
		for(int i=2;i<n;i++) {
			
			temp=f2+f1;
			f1=f2;
			f2=temp;
			System.out.print(f2+" ");	//	n elements	
			count++;
		}
		System.out.println(f2);//printing nth element
		
      System.out.println("no of elements"+count);
	}

}
