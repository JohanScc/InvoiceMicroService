package aforo255.ms.test.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import aforo255.ms.test.domain.PayInvoice;
import aforo255.ms.test.domain.Transaction;

@Service
public class TransactionEvents {
	@Autowired
	private ITransactionService service ; 
	private Logger log = LoggerFactory.getLogger(TransactionEvents.class);
	@Autowired
	private ObjectMapper objectMapper ; 
	
	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		Transaction transaction = new Transaction();
		PayInvoice event = objectMapper.readValue(consumerRecord.value(), PayInvoice.class);
		log.info("transactionEvent : {}" + event.getIdOperation());
		transaction.setAmount(event.getAmount());
		transaction.setId_invoice(event.getIdInvoice());
		transaction.setDate(event.getDate());
		service.save(transaction);
		
	}
}
