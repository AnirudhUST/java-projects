package samplejava2;

public class CurrentAccount extends Account implements MaintenanceCharge{
	
	

	

	public CurrentAccount(String accNo, String cusName, float balance) {
		super(accNo, cusName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculatemaintenancecharge(float noofYear) {
		
		return ((100*noofYear)+200);
	}

	
}
