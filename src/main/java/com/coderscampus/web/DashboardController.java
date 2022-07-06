package com.coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.domain.User;
import com.coderscampus.service.AdminService;

@Controller
public class DashboardController {
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/dashboard")
	public String getDashboard(@AuthenticationPrincipal User user, ModelMap model) {
		model.put("user",user);
		
		return "dashboard";
	}
}
