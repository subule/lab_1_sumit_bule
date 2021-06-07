package InheritDemo;

public class Employee {
	private String name;
	private int emp_id;
	private String location;
	private double basic_salary;

	public Employee() {
		System.out.println("Parameterless Constructor of Employee Class");
	}
	public Employee(String name, int emp_id, String location, double basic_salary) {
		this.name = name;
		this.emp_id = emp_id;
		this.location = location;
		this.basic_salary = basic_salary;
		System.out.println("Parameterised Constructor of Employee Class");
	}
	
	public void showEmpDetails(String n, int id, String loc, double sal) {
		System.out.println("Method of Employee Class:\n Name: "+n+
	"\n Emp_id: "+id+"\n Location: "+loc+"\n Basic Salary: "+sal);
		System.out.println("Method of Employee Class");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", location=" + location + ", basic_salary="
				+ basic_salary + "]";
	}
}
