package hu.citec.financy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import hu.citec.financy.dao.FinancyRepository;
import hu.citec.financy.model.Receipt;

@SpringBootApplication
public class FinancyApplication {
	
	private static final Logger log = LoggerFactory.getLogger(FinancyApplication.class);

	@Bean
	 public CommandLineRunner cln(FinancyRepository repo) {
		return (args) ->{
			
		log.info("Receipts found with findAll():");
	    log.info("-------------------------------");
	      for (Receipt receipt : repo.findAll()) {
	        log.info(receipt.toString());
	      }
	      log.info("");};}
	
	public static void main(String[] args) {
		SpringApplication.run(FinancyApplication.class, args);
		
	}

}
