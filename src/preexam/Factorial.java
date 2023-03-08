package preexam;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("number:");
		num=sc.nextInt();
		int fact=1;
		while(num>0) {
			fact*=num;
			num--;
		}
		System.out.println("Factorial="+fact);

	}

}
