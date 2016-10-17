package com.cisc181.core;

import java.sql.Date;
import java.util.ArrayList;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import Exceptions.PersonException;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() throws PersonException {
		Staff staff1 = new Staff("First1", "Middle1", "Last1", new Date(1955), "123 Main Street", "5555555555",
				"fake1@gmail.com", "Monday 5pm", 5, 45000, new Date(1955), eTitle.MR);
		Staff staff2 = new Staff("First2", "Middle2", "Last2", new Date(1995), "123 Main Street", "5555555555",
				"fake2@gmail.com", "Tuesday 5pm", 5, 42000, new Date(1995), eTitle.MRS);
		Staff staff3 = new Staff("First3", "Middle3", "Last3", new Date(1965), "123 Main Street", "5555555555",
				"fake3@gmail.com", "Wednesday 5pm", 5, 62000, new Date(1965), eTitle.MR);
		Staff staff4 = new Staff("First4", "Middle4", "Last4", new Date(1975), "123 Main Street", "5555555555",
				"fake4@gmail.com", "Thursday 5pm", 5, 70000, new Date(1975), eTitle.MR);
		Staff staff5 = new Staff("First5", "Middle5", "Last5", new Date(1985), "123 Main Street", "5555555555",
				"fake5@gmail.com", "Friday 5pm", 5, 53000, new Date(1985), eTitle.MR);

		   ArrayList<Staff> people = new ArrayList<Staff>();
		     people.add(staff1);
		     people.add(staff2);
		     people.add(staff3);
		     people.add(staff4);
		     people.add(staff5);
		     
		double predictedAvgSalary = 54400.0;

		double avgSalary = (staff1.getSalary() + staff2.getSalary() + staff3.getSalary() + staff4.getSalary()
				+ staff5.getSalary()) / 5;

		assert (predictedAvgSalary == avgSalary);
	}
}