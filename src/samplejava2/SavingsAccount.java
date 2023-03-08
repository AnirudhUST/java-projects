package samplejava2;

public class SavingsAccount extends Account implements MaintenanceCharge {
	
	

	public SavingsAccount(String accNo, String cusName, float balance) {
		super(accNo, cusName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculatemaintenancecharge(float noofYear) {
		
		return ((50*noofYear)+50);
	}

}
