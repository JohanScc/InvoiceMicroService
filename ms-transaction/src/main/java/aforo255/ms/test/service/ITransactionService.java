package aforo255.ms.test.service;

import aforo255.ms.test.domain.Transaction;

public interface ITransactionService {

	public Transaction save (Transaction transaction);
	public Iterable<Transaction> findByAccountId (Integer accountId ); 
	public Iterable<Transaction> findAll();
}
