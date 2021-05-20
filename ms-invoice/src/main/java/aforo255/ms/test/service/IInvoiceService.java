package aforo255.ms.test.service;

import java.util.List;

import aforo255.ms.test.domain.Invoice;

public interface IInvoiceService {

	public List<Invoice> findAll();
	public Invoice findById (Integer id ); 
	public Invoice save (Invoice invoice);
}
