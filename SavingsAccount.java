
public class SavingsAccount extends BaseAccount {

	private double serviceCharge, interest;
	
	public SavingsAccount()
	{
		super();
		serviceCharge = 0.0;
		interest = 0.0;
	}
	public SavingsAccount(double balance, int number, String owner, double serviceCharge,
						  double interest)
	{
		// 'calling' the applicable base constructor
		super(balance,number,owner); 
		
		// Setting the newly added variables
		this.serviceCharge = serviceCharge;
		this.interest = interest; 
	}
	
	// Override withdraw()
	public void withdraw(double amount)
	{
		if(balance > 200.00)
		{
			balance -= amount;  
		}
		if(balance < 200.00)
		{
			System.out.println("Sorry, withdrawal failed.");
			balance -= serviceCharge;	
		}
	}
	
	public void setServiceCharge(double s)
	{
		serviceCharge = s;
	}
	
	public double getServiceCharge()
	{
		return serviceCharge;
	}
	
	public void setInterest(double i)
	{
		interest = i;
	}
	
	public double getInterest()
	{
		return interest;
	}
	
	// Override toString()
	public String toString()
	{
		return "###SavingsAccount###\nOwner: " + owner + "\nNumber: " + number + "\nBalance: $" + String.format("%.2f", balance) + "\n";
	}
	
	public void maintenance()
	{
		balance += balance * interest / 12;
	}
}
