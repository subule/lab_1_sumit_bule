package InheritDemo;

public class SalesManager extends Manager{

	private double bonus;

	public SalesManager() {
		super();
		System.out.println("Parameterless Constructor of SalesManager Class");
	}

	public SalesManager(String name, int emp_id, String location, double basic_salary, double allowance, double bonus) {
		super(name, emp_id, location, basic_salary, allowance);
		this.bonus = bonus;
		System.out.println("Parameterised Constructor of SalesManagerr Class");
		System.out.println("Bonus of the Employee are: "+bonus);
	}

	public void salaryAfterBonus(double basic, double allow, double bon) {
		System.out.println("Salary After Bonus: "+(basic+allow+bon));
		System.out.println("Method of SalesManager Class");
	}

	@Override
	public String toString() {
		return super.toString()+ "SalesManager [bonus=" + bonus + "]";
	}
}
