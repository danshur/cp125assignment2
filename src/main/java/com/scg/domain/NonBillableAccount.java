package com.scg.domain;

public enum NonBillableAccount implements Account{

	VACATION,
	SICK_LEAVE,
	BUSINESS_DEVELOPMENT;
	
	public String getName(){
		String name = toString();
		return name;
	}
	
	public boolean isBillable(){
		return false;
	}

}
