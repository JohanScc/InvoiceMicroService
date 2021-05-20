package aforo255.ms.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import aforo255.ms.test.domain.Transaction;



public interface TransactionRepository extends MongoRepository<Transaction, String>{

	@Query("{'accountId' : ? 0}")
	public Iterable<Transaction> findByAccountId(Integer accountId);
}
