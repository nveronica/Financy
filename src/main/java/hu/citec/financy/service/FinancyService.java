package hu.citec.financy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.citec.financy.dao.FinancyRepository;
import hu.citec.financy.model.Receipt;

@Service
public class FinancyService {
	
	@Autowired
	private FinancyRepository financyRepository;
	
	public List<Receipt> findReceipts(int id) {
		
		return (List<Receipt>) financyRepository.findAll(id);
	}

}
