package aforo255.ms.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aforo255.ms.test.domain.PayInvoice;

@Repository
public interface IPayDao extends CrudRepository<PayInvoice, Integer> {

}
