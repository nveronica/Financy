package hu.citec.financy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.citec.financy.model.Receipt;

@Repository
public interface FinancyRepository extends JpaRepository<Receipt, Integer> {
	@Query("select r from Receipt r where r.active = 1")
	public List<Receipt> findAll();
	
	//@Query("INSERT INTO RECEIPT(id, total, date)VALUES(1, 210,2020-11-17)")
	//public void save();
	//List<Receipt> receipts(int id);
	//@Query("insert into receipt(id, value, date) values(?,?,?)")
	//public void addReceipt(Receipt receipt);
}
