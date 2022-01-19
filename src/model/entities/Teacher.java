package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.Matters;
import model.enums.SchoolSeries;

public class Teacher extends Employee{
	
	private List<Matters> matters = new ArrayList<>();
	
	private List<SchoolSeries> classes = new ArrayList<>();
	
	public Teacher() {
	}

	public Teacher(String name, String email, Long id, Double salary, List<Matters> matters,
			List<SchoolSeries> classes) {
		super(name, email, id, salary);
		this.matters = matters;
		this.classes = classes;
	}

	public List<Matters> getMatters() {
		return matters;
	}

	public List<SchoolSeries> getClasses() {
		return classes;
	}
	
	public void addMatter(Matters matter) {
		if (matter == null) {
			throw new RuntimeException("Error: Don't have matter!");		
		}else {
			matters.add(matter);
		}
	}
	
	public void removeMatter(Matters matter) {
		if (matter == null) {
			throw new RuntimeException("Error: Don't have matter!");		
		}else if (!matters.contains(matter)){	
			throw new RuntimeException("Error: Don't exist this matter!");	
		}else {
			matters.remove(matter);	
		}
	}
 
	@Override
	public String toString() {
		return "Teacher [Name=" + getName() + ", Id=" + getId() + ", EmaiL=" + getEmail() 
		+  ", Salary=" + getSalary() + ", matters=" + matters + ", classes=" + classes + "]";
	}

	

}
