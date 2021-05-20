package aforo255.ms.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import aforo255.ms.test.domain.PayInvoice;
import aforo255.ms.test.producer.PayEventProducer;
import aforo255.ms.test.service.IPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class PayController {

	@Autowired
	private IPayService service;
	@Autowired
	PayEventProducer eventProducer;
	private Logger log = LoggerFactory.getLogger(PayController.class);
	
	@PostMapping("/v1/payevent")
	public ResponseEntity<PayInvoice> postDepositEvent(@RequestBody PayInvoice invoice) throws JsonProcessingException {
		log.info("antes de transql");
		PayInvoice transql = service.save(invoice);
		log.info("despues de transql");
		log.info("antes de sendDepositEvent");
		eventProducer.sendPayEvent(transql);
		log.info("despues de sendDepositEvent");
		return ResponseEntity.status(HttpStatus.CREATED).body(transql);
	}
}