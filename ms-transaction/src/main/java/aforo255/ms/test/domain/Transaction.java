package aforo255.ms.test.domain;

import java.util.Date;



import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {

	@BsonId
	private String id ; 
	private Integer id_invoice ;
	private double amount ;
	private Date date;
	public String getId_transaction() {
		return id;
	}
	public void setId_transaction(String id_transaction) {
		this.id = id_transaction;
	}
	public Integer getId_invoice() {
		return id_invoice;
	}
	public void setId_invoice(Integer id_invoice) {
		this.id_invoice = id_invoice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
