package aforo255.ms.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.test.domain.Transaction;
import aforo255.ms.test.repository.TransactionRepository;




@Service
public class TransactionServiceImpl implements ITransactionService{

	@Autowired
	TransactionRepository _repository;
	
	@Override
	public Transaction save(Transaction transaction) {
		// TODO Auto-generated method stub
		return _repository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByAccountId(Integer accountId) {
		// TODO Auto-generated method stub
		return _repository.findByAccountId(accountId);
	}

	@Override
	public Iterable<Transaction> findAll() {
		// TODO Auto-generated method stub
		return _repository.findAll();
	}

}
