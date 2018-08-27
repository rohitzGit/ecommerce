package com.navz.project.ecommerce.serviceImpl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navz.project.ecommerce.entity.CompanyRevenue;
import com.navz.project.ecommerce.entity.EmployeeInformation;
import com.navz.project.ecommerce.entity.OrderCollectionStatus;
import com.navz.project.ecommerce.entity.OrderReceived;
import com.navz.project.ecommerce.entity.ProductCategory;
import com.navz.project.ecommerce.repositories.CompanyRevenueRepository;
import com.navz.project.ecommerce.repositories.EmployeeInformationRepository;
import com.navz.project.ecommerce.repositories.OrderCollectionStatusRepository;
import com.navz.project.ecommerce.repositories.OrderReceivedRepository;
import com.navz.project.ecommerce.repositories.ProductCatogoryRepository;
import com.navz.project.ecommerce.service.DashBoardService;

@Service
public class DashBoardServiceImpl implements DashBoardService {

	@Autowired
	CompanyRevenueRepository companyRevenueRepository;
	
	@Autowired
	EmployeeInformationRepository employeeInformationRepository;
	
	@Autowired
	OrderCollectionStatusRepository orderCollectionStatusRepository;
	
	@Autowired
	OrderReceivedRepository orderReceivedRepository;
	
	@Autowired
	ProductCatogoryRepository productCatogoryRepository;
	
	@Override
	public List<CompanyRevenue> getTodayRevenueDash() {
		
		Map<String,Object> populateCompanyRevenue = new HashMap<String,Object>();
		
		List<CompanyRevenue> companyRevenueList = companyRevenueRepository.findAll();
		
		List<String> lable = new ArrayList<String>();
		List<String> _revenue = new ArrayList<String>();
		double totalExpense = 0;
		double totalMargins = 0;
		double totalRevenue = 0;
		 
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		
		for(CompanyRevenue companyRevenue : companyRevenueList) {
			lable.add(companyRevenue.get_month());
			_revenue.add(String.valueOf(companyRevenue.getRevenue()));
			totalExpense = totalExpense + companyRevenue.getExpense();
			totalRevenue = totalRevenue + companyRevenue.getRevenue();
			totalMargins = totalMargins + companyRevenue.getMargins();
		}
		
		populateCompanyRevenue.put("crLables", lable.toString());
		populateCompanyRevenue.put("crRevenue", _revenue.toString());
		populateCompanyRevenue.put("totalRevenue", currencyFormatter.format(totalRevenue));
		populateCompanyRevenue.put("totalMargins", currencyFormatter.format(totalMargins));
		populateCompanyRevenue.put("totalExpense", currencyFormatter.format(totalExpense));
		
		return companyRevenueRepository.findAll();
	}

	@Override
	public List<ProductCategory> getBestCategory() {
		// TODO Auto-generated method stub
		return productCatogoryRepository.findByBestCategory(true);
	}

	@Override
	public List<OrderReceived> getAllOrderReceived() {
		// TODO Auto-generated method stub
		return orderReceivedRepository.findAll();
	}

	@Override
	public List<OrderCollectionStatus> getOrderCollection() {
		// TODO Auto-generated method stub
		return orderCollectionStatusRepository.findAll();
	}

	@Override
	public List<EmployeeInformation> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeInformationRepository.findAll();
	}

	@Override
	public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
		// TODO Auto-generated method stub
		return employeeInformationRepository.save(employeeInformation);
		
	}

	@Override
	public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
		// TODO Auto-generated method stub
		return employeeInformationRepository.save(employeeInformation);
	}

	@Override
	public void deleteEmployee(EmployeeInformation employeeInformation) {
		// TODO Auto-generated method stub
		employeeInformationRepository.delete(employeeInformation);
	}

	@Override
	public EmployeeInformation getEmployee(String pk) {
		// TODO Auto-generated method stub
		return employeeInformationRepository.findByPk(pk);
	}

}
