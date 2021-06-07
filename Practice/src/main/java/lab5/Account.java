package lab5;
import lab5.Person;

public class Account {
	private long accNum;
	protected double balance;
	private Person accHolder;
	
	public Account(long acNo, double bal, Person accHolder) {
		this.accNum= acNo;
		this.balance= bal;
		this.accHolder=accHolder;
		System.out.println("Account Created for: "+accHolder.getName()+" with initial balance of: "+balance);
	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double depAmt) {
		this.balance = balance+depAmt;
		System.out.println("The Updated Balance is: "+balance);
	}
	
	public void withdraw(double witAmt) {
		
		System.out.println("The Updated Balance is: "+balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
