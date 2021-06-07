package lab5;

public class SavingsAccount extends Account{
	public final double minBalance;
	
	public SavingsAccount(long acNo, double bal, Person accHolder) {
		super(acNo, bal, accHolder);
		this.minBalance = 500;
	}

	@Override
	public void withdraw(double balance) {
		if((this.balance - balance)>=minBalance)
		this.balance=this.balance-balance;
		else
			System.out.println("Withdraw Not Allowed");
	}
}
