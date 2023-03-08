package samplejava;

public class Main {

	public static void main(String[] args) {
		
		Customer c=new Customer(100, "agk", "abcd@gmil");
		
		
		SavingAccount s= new SavingAccount(123,c,4000,1000);
		boolean f=s.withdraw(450);
		if(f=true) {System.out.println(c.getCustomerid()+" "+c.getCustomerName()+" "+c.getEmailId());}}}


