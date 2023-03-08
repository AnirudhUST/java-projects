package java8projects;

public class Comp {
	
	int id;
	String name;
	double salary;
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Comp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		return "Comp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
