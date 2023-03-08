package samplejava2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Account a = new Account(null, null, 0);
		MaintenanceCharge s = new SavingsAccount(null, null, 0);
		MaintenanceCharge c = new CurrentAccount(null, null, 0);
		

		System.out.println("1.savings account 2.Current account");
		 int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice");
		ch=sc.nextInt();
		if(ch == 1)
		{
			System.out.println("accnt no:");
			a.setAccNo(sc.next());
			System.out.println("cus name:");
			a.setCusName(sc.next());
			System.out.println("balance:");
			a.setBalance(sc.nextFloat());
			float year = sc.nextFloat();
			float res = s.calculatemaintenancecharge(year);
			
			
			System.out.println(res);
			
		}
		else
		{
			System.out.println("accnt no:");
			a.setAccNo(sc.next());
			System.out.println("cus name:");
			a.setCusName(sc.next());
			System.out.println("balance:");
			a.setBalance(sc.nextFloat());
			float year = sc.nextFloat();
			float res = c.calculatemaintenancecharge(year);
			
			
			System.out.println(res);
			
		}
			
		
		
		
	}

}
