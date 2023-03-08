package samplejava2;

public class Account{

	private String AccNo;
	private String CusName;
	private float balance;
	/**
	 * @param accNo
	 * @param cusName
	 * @param balance
	 */
	public Account(String accNo, String cusName, float balance) {
		super();
		AccNo = accNo;
		CusName = cusName;
		this.balance = balance;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
	}
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String cusName) {
		CusName = cusName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
    
}
