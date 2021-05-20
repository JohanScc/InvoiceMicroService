package aforo255.ms.test.domain;

import java.io.Serializable;
import java.sql.Date;



public class PayInvoice  implements Serializable{

	
	private static final long serialVersionUID = 1L;	

	private Integer idOperation ;
	private Integer idInvoice ;
	private double amount ;
	private Date date;
	public Integer getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(Integer idOperation) {
		this.idOperation = idOperation;
	}
	public Integer getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(Integer idInvoice) {
		this.idInvoice = idInvoice;
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