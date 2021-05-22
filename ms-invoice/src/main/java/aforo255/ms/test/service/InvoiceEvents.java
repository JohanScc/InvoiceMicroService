package aforo255.ms.test.service;

import org.springframework.stereotype.Service;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import aforo255.ms.test.domain.Invoice;
import aforo255.ms.test.domain.PayInvoice;
import aforo255.ms.test.domain.State;
import aforo255.ms.test.transversal.Constants;

@Service
public class InvoiceEvents {
	@Autowired
	private IInvoiceService invoiceService ; 
	private Logger log = LoggerFactory.getLogger(InvoiceEvents.class);
	@Autowired
	private ObjectMapper objectMapper ; 
	
	public void processInvoiceEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		Invoice invoice = new Invoice();
		State state = new State();
		PayInvoice event = objectMapper.readValue(consumerRecord.value(), PayInvoice.class);
		invoice = invoiceService.findById(event.getIdInvoice());
		
		invoice.setAmount(event.getAmount());
		if(invoice.getAmount() == event.getAmount()) {
			state.setIdState(Constants.Invoice_Payed);
			invoice.setState(state);
		}
		else {
			state.setIdState(Constants.Invoice_Incompleted);
			invoice.setState(state);
		}
		log.info("Actulizando N° Factura *** " +event.getIdInvoice());
		invoiceService.save(invoice);
	}
	
}