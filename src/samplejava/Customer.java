package samplejava;

public class Customer {
 
	private int customerid;
	private String customerName;
	private String emailId;
	
	public Customer(int customerid, String customerName, String emailId) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.emailId = emailId;
		
		
	}

	public int getCustomerid() {
		return customerid;
	}

	
	

	public String getCustomerName() {
		return customerName;
	}

	
	

	public String getEmailId() {
		return emailId;
	}

	
	
	
	
}
