package com.navz.project.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.navz.project.ecommerce.service.DashBoardService;

@Controller
public class ThymeleafController {
	
	@Autowired
	DashBoardService dashBoardService;
	
	@RequestMapping("/")
	public String getDashDetail(Model model) {
		
		//populate company revenue data
		model.addAttribute("cr",dashBoardService.getTodayRevenueDash());
		return "/index";
		
	}

}
