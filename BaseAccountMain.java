
public class BaseAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an instance of BaseAccount
		// BaseAccount ba = new BaseAccount();
		
		// Change the variables
		// ba.setOwner("Lupe");
		// ba.setNumber(4444);
		// ba.setBalance(0.0);
		
		// Deposit $500 and then print the summary 
		// ba.deposit(500.00);
		// System.out.println(ba);
		
		// Deposit $150 and then print the summary
		// ba.deposit(150.00);
		// System.out.println(ba);
		
		// Withdraw $200 and then print this accounts summary 
		// ba.withdraw(200.00);
		// System.out.println(ba);
		
		// Create an instance of SavingsAccount 
		SavingsAccount sa = new SavingsAccount();
		
		// Variable change for SavingsAccount
		sa.setOwner("Lupe");
		sa.setNumber(5555);
		
		// Zero initial balance, $5 service charge, 1% interest rate
		sa.setBalance(0.0);
		sa.setServiceCharge(5.00);
		sa.setInterest(0.01);
		
		// Deposit $300 and then print the summary
		sa.deposit(300.00);
		System.out.println(sa);
		
		// Deposit $100 and then print the summary
		sa.deposit(100.00);
		System.out.println(sa);
		
		// Withdraw $150 and then print the summary
		sa.withdraw(150.00);
		System.out.println(sa);
		
		// Withdraw $100 and then print the summary
		sa.withdraw(100.00);
		System.out.println(sa);
		
		// Call maintenance, print summary
		sa.maintenance();
		System.out.println(sa);
		
		// Create an instance of CheckingAccount
		CheckingAccount ca = new CheckingAccount();
		
		// Variable change for CheckingAccount
		ca.setOwner("Lupe");
		ca.setNumber(7391);
		
		// Zero initial balance, $5 service charge
		ca.setBalance(0.0);
		ca.setServiceCharge(5.00);
		
		// Deposit $250, print summary
		ca.deposit(250.00);
		System.out.println(ca);
		
		// Withdraw $200, print summary
		ca.withdraw(200.00);
		System.out.println(ca);
		
		// Withdraw $100, print summary
		ca.withdraw(100.00);
		System.out.println(ca);
		
		// Call maintenance, print summary
		ca.maintenance();
		System.out.println(ca);
	}
}
