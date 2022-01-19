package model.entities;

public class Employee extends Person{
	
	private Long registrationNumber;
	private Double salary;
	
	public Employee() {
	}
	
	public Employee(String name, String email, Long id, Double salary) {
		super(name, email);
		this.registrationNumber = id;
		this.salary = salary;
	}

	public Long getId() {
		return registrationNumber;
	}

	public void setId(Long id) {
		this.registrationNumber = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
