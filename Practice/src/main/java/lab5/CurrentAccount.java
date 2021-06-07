package lab5;

public class CurrentAccount extends Account{
	private double overdraftLimit;
	
	public CurrentAccount(long acNo, double bal,Person accHolder) {
		super(acNo, bal, accHolder);
		overdraftLimit = 2500;
	}

	@Override
	public void withdraw(double witAmt) {
		if(witAmt<overdraftLimit)
			System.out.println("Withdraw Allowed");
		else
			System.out.println("Withdraw not Allowed");
	}
}
