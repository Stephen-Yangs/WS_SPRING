package com.ncs.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Service;
import com.ncs.bean.Employee;

@Service("employeeManagementImpl")
@WebService
public class EmployeeManagementImpl implements EmployeeManagement {

	private List<Employee> list = new ArrayList<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ncs.service.EmployeeManagement#add(com.ncs.bean.Employee)
	 */
	@Override
	public boolean add(Employee employee) {
		try {
			list.add(employee);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ncs.service.EmployeeManagement#query()
	 */
	@Override
	public List<Employee> query() {
		return list;
	}

}
