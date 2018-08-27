package com.navz.project.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.navz.project.ecommerce.entity.CompanyRevenue;
import com.navz.project.ecommerce.entity.EmployeeInformation;
import com.navz.project.ecommerce.entity.OrderCollectionStatus;
import com.navz.project.ecommerce.entity.OrderReceived;
import com.navz.project.ecommerce.entity.ProductCategory;


public interface DashBoardService {
	
	List<CompanyRevenue> getTodayRevenueDash();
	List<ProductCategory> getBestCategory();
	List<OrderReceived> getAllOrderReceived();
	List<OrderCollectionStatus> getOrderCollection();
	List<EmployeeInformation> getAllEmployee();
	
	EmployeeInformation addEmployee(EmployeeInformation employeeInformation);
	EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
	void deleteEmployee(EmployeeInformation employeeInformation);
	
	EmployeeInformation getEmployee(final String pk);

}
