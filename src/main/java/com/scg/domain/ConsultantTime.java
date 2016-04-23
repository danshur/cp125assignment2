package com.scg.domain;



import java.util.Date;

public class ConsultantTime implements Account {

	public ConsultantTime(Date currentDay, ClientAccount clientAccount, Object sOFTWARE_ENGINEER, int stdWorkDay) {
		// TODO Auto-generated constructor stub
	}

	public ConsultantTime(Date currentDay, NonBillableAccount vacation, Skill softwareEngineer, int stdWorkDay) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBillable() {
		// TODO Auto-generated method stub
		return false;
	}

}
