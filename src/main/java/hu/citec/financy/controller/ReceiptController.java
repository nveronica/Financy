package hu.citec.financy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.citec.financy.dao.FinancyRepository;
import hu.citec.financy.model.Receipt;
import hu.citec.financy.service.FinancyService;

@RestController
@RequestMapping("/")
public class ReceiptController {
	@Autowired
	private FinancyService service;
	@Autowired
	private FinancyRepository repo;
	
	@GetMapping("/")
	public List<Receipt> getHome() {
		//model.addAttribute("receipts", service.findReceipts());
		return (List<Receipt>) repo.findAll();
	}
	
	@PostMapping("/receipt")
    public Receipt createReceipt(@Validated@RequestBody Receipt receipt) {
        return repo.save(receipt);
    }
}
