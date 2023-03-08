package samplejava;

 public class SavingAccount extends Account{
	
	private double minimumBalance;

	/**
	 * @param accountNumber
	 * @param customerObj
	 * @param balance
	 * @param minimumBalance
	 */
	public SavingAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
      
	
	public boolean withdraw(double amount)

	{
		
		if((balance-amount)>minimumBalance)
		    {amount=balance -amount;
		    System.out.println("true"+amount);
			boolean g= true;
			return g;}
		else
			{System.out.println("false");
			return false;}
		
	}
	
	}

	


