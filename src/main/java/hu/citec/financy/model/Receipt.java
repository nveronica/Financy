package hu.citec.financy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receipt")
public class Receipt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int total;

	protected Receipt() {
	}

	public Receipt(int id, int total, Date date) {
		this.id = id;
		this.total = total;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	private Date date;

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Receipt [id=" + id + ", total=" + total + ", date=" + date + "]";
	}

}
