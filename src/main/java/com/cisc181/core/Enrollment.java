package com.cisc181.core;

import java.util.*;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {

	}

	public Enrollment(UUID StudID, UUID SecID){
		StudentID = StudID;
		SectionID = SecID;
		EnrollmentID = UUID.randomUUID();
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	
}