package Exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {

	private Person p;

	public PersonException(Person prson) {
		this.p = prson;
	}
}