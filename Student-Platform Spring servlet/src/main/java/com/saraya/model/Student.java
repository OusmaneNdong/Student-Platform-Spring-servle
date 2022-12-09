package com.saraya.model;

import java.time.LocalDate;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String trainingDuration;
	private LocalDate registrationDate;
	private String studentImage;
	
	
	public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, String trainingDuration,
			LocalDate registrationDate, String studentImage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.trainingDuration = trainingDuration;
		this.registrationDate = registrationDate;
		this.studentImage = studentImage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getStudentImage() {
		return studentImage;
	}

	public void setStudentImage(String studentImage) {
		this.studentImage = studentImage;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", trainingDuration=" + trainingDuration + ", registrationDate=" + registrationDate
				+ ", studentImage=" + studentImage + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	
	

}
