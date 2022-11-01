package entities;

public class employee {
	private int id;
	private String name;
	private double salary;
	
	
	public employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void aumento(double quantia) {
		this.salary += salary*quantia/100;
	}
	@Override
	public String toString() {
		return "employee id = " + id + "; name = " + name + "; salary = " + salary;
	}
	
	
	
	
}
