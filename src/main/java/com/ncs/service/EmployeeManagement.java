package com.ncs.service;

import java.util.List;
import javax.jws.WebService;

import com.ncs.bean.Employee;

@WebService(serviceName="EmployeeManagement")
public interface EmployeeManagement {

	boolean add(Employee employee);

	List<Employee> query();

}