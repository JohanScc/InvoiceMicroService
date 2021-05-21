package aforo255.ms.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import aforo255.ms.test.dao.IPayDao;
import aforo255.ms.test.domain.PayInvoice;

public class PayServiceImpl implements IPayService {

	@Autowired
	private IPayDao _payDao;
	@Override
	public PayInvoice save(PayInvoice invoice) {
		// TODO Auto-generated method stub
		return _payDao.save(invoice);
	}
	
}
