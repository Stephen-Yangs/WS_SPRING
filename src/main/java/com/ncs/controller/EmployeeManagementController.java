package com.ncs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ncs.bean.Employee;
import com.ncs.service.EmployeeManagement;
@Controller
public class EmployeeManagementController {

	@Autowired
	private EmployeeManagement employeeManagement;

	public void TestMethod() {
		Employee employee = new Employee();
		employee.setID(1001);
		employee.setName("JACK");

		employeeManagement.add(employee);
	}

}
