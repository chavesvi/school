package model.entities;

import model.enums.SchoolSeries;

public class Student extends Person{

	private Long registrationNumber;
	private Double monthlyPayment;
	private SchoolSeries serie;
	
	public Student() {
	}
	
	public Student(String name, String email, Long registrationNumber, Double monthlyPayment, SchoolSeries serie) {
		super(name, email);
		this.registrationNumber = registrationNumber;
		this.monthlyPayment = monthlyPayment;
		this.serie = serie;
	}


	public SchoolSeries getSerie() {
		return serie;
	}
	public void setSerie(SchoolSeries serie) {
		this.serie = serie;
	}
	public Long getRegistrationNumber() {
		return registrationNumber;
	}
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
}
