package com.scg.util;

import java.util.UUID;

public class Name {
	private String firstName;
	private String lastName;
	private String middleName;

	public Name() {
		this.setFirstName("");
		this.setLastName("");
		this.setMiddleName("");
	}

	public Name(String lastName, String firstName) {
		this(lastName, firstName, "");
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public Name(String lastName, String firstName, String middleName) {
		super();
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleName(middleName);
	}

	public boolean equals(Object obj) {
		boolean rcode = false;
		if (obj != null && obj instanceof Name) {
			Name other = (Name) obj;
			rcode = areEqual(firstName, other.firstName) && areEqual(middleName, other.middleName)
					&& areEqual(lastName, other.lastName);
		}
		return rcode;

	}

	private boolean areEqual(String name1, String name2) {
		boolean rcode;
		if (name1 == name2)
			rcode = true;
		else if (name1 != null)
			rcode = name1.equals(name2);
		else
			rcode = false;

		return rcode;
	}

	public int hashCode() {
		// return UUID.randomUUID().hashCode();
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		return result;

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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
