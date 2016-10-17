package com.cisc181.core;

import java.util.*;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public Course(UUID cID, String CName, int GPts) {
		setCourseID(cID);
		setCourseName(CName);
		setGradePoints(GPts);

	}

	// Getters and Setters CourseID 
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	// Getters and Setters CourseName 
	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	// Getters and Setters Grade Points 
	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

}
