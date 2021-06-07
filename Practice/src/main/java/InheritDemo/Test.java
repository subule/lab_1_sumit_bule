package InheritDemo;

public class Test {

	public static void main(String[] args) {
		Employee[] empList = new Employee[3];
		
		empList[0] = new Employee("Ramesh", 123, "Pune", 10000);
		empList[1] = new Manager("Bhavesh", 155, "Mumbai", 10000, 500);
		empList[2] = new SalesManager("Suresh", 220, "Noida", 10000, 500, 5000);
		
		for(Employee e: empList) {
			System.out.println(e);
		}
		
	}

}
