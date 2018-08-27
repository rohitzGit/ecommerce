package com.navz.project.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.navz.project.ecommerce.entity.EmployeeInformation;
import com.navz.project.ecommerce.service.DashBoardService;

@RestController
public class restEndpointController {
	
	@Autowired
	private DashBoardService dashBoardService;
	
	@RequestMapping("/employees")
	public List<EmployeeInformation> getAllEmp(){
		return dashBoardService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.POST,value= "/employee/add")
	public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation) {
		
		if(dashBoardService.addEmployee(employeeInformation)!=null) {
			return "Employee added successfully";
		}else
		{
			return "Employee couldnt be added";
		}
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employee/delete")
	public String deleteEmp(@RequestParam(name="empId", required=true) String pk) {
		try {
		dashBoardService.deleteEmployee(dashBoardService.getEmployee(pk));
		return "deleted";
		}
		catch(Exception e) {
			return "error in deleting";
		}
	}
}
