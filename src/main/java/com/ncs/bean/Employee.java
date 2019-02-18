package com.ncs.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private Integer ID;

	private String Name;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
