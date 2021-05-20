package aforo255.ms.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aforo255.ms.test.domain.Transaction;
import aforo255.ms.test.service.ITransactionService;




@RestController
public class TransactionController {

	@Autowired
	ITransactionService _transaction ;	
	
	@GetMapping("listar")	
	public List<Transaction> listar (){
		
		return ( List<Transaction>)_transaction.findAll();
	}
	
	@GetMapping ("/transaction/{accountId}")
	public ResponseEntity<?> getByAccountId (@PathVariable Integer accountId){
		
		Iterable< Transaction> transaction= _transaction.findByAccountId(accountId);
		return ResponseEntity.ok(transaction);
	}	
}