package aforo255.ms.test.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
@Table(name="invoice")
public class Invoice  implements Serializable{

	
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_invoice")
	private Integer idInvoice ;
	@Column(name="amount")
	private double amount ;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_state" , insertable =false , updatable = true)
	@Fetch(FetchMode.JOIN)
	private State state ;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_customer" , insertable =false , updatable = false)
	@Fetch(FetchMode.JOIN)
	private Customer customer;


	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

}