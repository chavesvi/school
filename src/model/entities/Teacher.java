package model.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.enums.Matters;
import model.enums.SchoolSeries;

public class Teacher extends Employee{
	
	private List<Matters> matters = null;
	
	private Map<SchoolSeries, Matters> classes = new HashMap<>();
	
	public Teacher(String name, String email, Long id, Double salary,
			Map<SchoolSeries, Matters> classes) {
		super(name, email, id, salary);
		this.classes = classes;
		updateMatter();
	}

	public List<Matters> getMatters() {
		return matters;
	}

	public Map<SchoolSeries, Matters> getClasses() {
		return classes;
	}
	
	public void updateMatter() {
		if (matters == null) {
			matters = new ArrayList<>();
			for (SchoolSeries key : classes.keySet()) {
				if (!matters.contains(classes.get(key))) {
					matters.add(classes.get(key));
				}
				continue;
			}
		}
	}
	
	public void addMatter(Matters matter) {
		if (matter == null) {
			throw new RuntimeException("Error: Don't have matter!");		
		}else if (matters.contains(matter)) {
				throw new RuntimeException("Error: the teacher already has this matter¹!");
			}
			matters.add(matter);
	}

	public void removeMatter(Matters matter) {
		if (matter == null) {
			throw new RuntimeException("Error: It is necessary to have matter!");		
		}else if (!matters.contains(matter)){	
			throw new RuntimeException("Error: Don't exist this matter!");	
		}
		matters.remove(matter);	
	}
 
	public void addClass(SchoolSeries serie, Matters matter) {
		if (matter == null || serie == null) {
			throw new RuntimeException("Error: It is necessary to have serie and matter");
		} 
		//CONSERTAR
		if (classes.containsKey(serie)) {
			throw new RuntimeException("Error: preciso concertar");
		}
		classes.put(serie, matter);
		if (!matters.contains(matter)) {
			matters.add(matter);
		}
	}
	
	public void removeClass(SchoolSeries serie) {
		if (serie == null) {
			throw new RuntimeException("Error: It is necessary to have serie!");
		}
		if (!classes.containsKey(serie)) {
			throw new RuntimeException("Error: Don't exist this serie");
		}
		classes.remove(serie);
	}
	
	@Override
	public String toString() {
		return "Teacher [Name=" + getName() + ", Id=" + getId() + ", EmaiL=" + getEmail() 
		+  ", Salary=" + getSalary() + ", matters=" + matters + ", classes=" + classes + "]";
	}

	

}
