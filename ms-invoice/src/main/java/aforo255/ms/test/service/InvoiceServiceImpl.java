package aforo255.ms.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import aforo255.ms.test.dao.IInvoiceDao;
import aforo255.ms.test.domain.Invoice;

public class InvoiceServiceImpl implements IInvoiceService {

	@Autowired
	private IInvoiceDao _invoiceRepo;
	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return  (List<Invoice>)_invoiceRepo.findAll();
	}

	@Override
	public Invoice findById(Integer id) {
		// TODO Auto-generated method stub
		return _invoiceRepo.findById(id).orElse(null);
	}

	@Override
	public Invoice save(Invoice invoice) {
		// TODO Auto-generated method stub
		return _invoiceRepo.save(invoice);
	}

}
