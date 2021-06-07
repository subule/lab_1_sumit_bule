package InheritDemo;
import InheritDemo.Employee;

public class Manager extends Employee{
	private double allowance;
	public Manager() {
		System.out.println("Parameterless Constructor of Manager Class");
	}

	public Manager(String name, int emp_id, String location, double basic_salary, double allowance) {
		super(name, emp_id, location, basic_salary);
		this.allowance = allowance;
		System.out.println("Parameterised Constructor of Manager Class");
		System.out.println("Allowances of the Employee are: "+allowance);
	}
	
	public void salaryAfterAllowance(double basic, double allow) {
		System.out.println("Salary After allowances: "+(basic+allow));
		System.out.println("Method of Manager Class");
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [allowance=" + allowance + "]"; //TO SHOW EVERYTHING. OTHERWISE, ONLY ALLOWANCES WILL BE SHOWN WHEN OBJECT OF MANAGER CLASS IS INVOKED
	}

}
