package hu.citec.financy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.citec.financy.service.FinancyService;

@Controller
public class HomeController {
	@Autowired
	private FinancyService service;
	
	@RequestMapping("/")
	public String getHome(Model model) {
		model.addAttribute("receipts", service.findReceipts());
		return "index";
	}
}
