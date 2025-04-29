class Employee {
	String name;
	int id;
	double salary;

	Employee(String name, int id, double salary) {
		
		this.name = name;
		this.id = id;
		this.salary  = salary;
	}

	void displayDetails() {
	// Display employee details
		System.out.println("Employee name is "+name+" id is "+id+" salary is "+salary);
	}
}

class Manager extends Employee {

	Manager(String name, int id, double salary) {
		super(name, id, salary);
	
	}
@Override

	void displayDetails() {
	// Display employee details and bonus
	
		super.displayDetails();
		
		double bonus  = 0.2*salary; //20%
		System.out.println("bonus ="+bonus);
	}

}
