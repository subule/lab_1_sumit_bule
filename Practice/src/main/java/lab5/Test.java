package lab5;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Smith", 23);
		Account smi = new Account(12345, 2000,p1);
		Account kat = new SavingsAccount(12346, 3000, new Person("Kathy", 28));
		
		smi.deposite(2000);
		kat.withdraw(4000);
		
		System.out.println(kat.getAccHolder().getName());
		System.out.println(p1);
	}

}
