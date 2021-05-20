package aforo255.ms.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aforo255.ms.test.domain.Invoice;

@Repository
public interface IInvoiceDao extends CrudRepository<Invoice, Integer> {


}
