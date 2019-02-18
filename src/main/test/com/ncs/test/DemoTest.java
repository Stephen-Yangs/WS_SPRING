package com.ncs.test;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.controller.EmployeeManagementController;
import com.ncs.service.EmployeeManagement;
import com.ncs.service.EmployeeManagementImpl;

public class DemoTest {

	private EmployeeManagementImpl eManagementImpl;

	@Test
	public void testSpring() {

		// 创建IOC容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// 从容器中获取我们所需要的对象
		EmployeeManagementController controller = context.getBean(EmployeeManagementController.class);
		controller.TestMethod();

	}

	@Test
	public void servicePublish() {

		String address = "http://localhost:8090/ws/cxf/EmployeeManagemsentService";

		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address);
		factoryBean.setServiceClass(EmployeeManagement.class);
		factoryBean.setServiceBean(eManagementImpl);
		factoryBean.getInInterceptors().add(new LoggingInInterceptor());
		factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		factoryBean.create();
	}

}
