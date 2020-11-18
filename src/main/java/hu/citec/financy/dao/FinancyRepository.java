package hu.citec.financy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.citec.financy.model.Receipt;

@Repository
public interface FinancyRepository extends CrudRepository<Receipt, Integer> {
	@Query("select r from Receipt r where r.id = ?1")
	public List<Receipt> findAll(int Id);
	
	//Receipt findById(int id);
	
	//public void save();
	//List<Receipt> receipts(int id);
	//@Query("insert into receipt(id, value, date) values(?,?,?)")
	//public void addReceipt(Receipt receipt);
}
