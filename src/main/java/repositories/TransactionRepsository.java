package repositories;

import entities.Role;
import entities.Transaction;
import org.springframework.data.repository.CrudRepository;


public interface TransactionRepsository extends CrudRepository<Transaction, Long>
{
	Transaction findBywithdrowal(Long withdrowal);
	Transaction findByDeposit(Long deposit);
	Transaction findByamount(Long amount);
	Transaction findByaccounts(Long accounts);

}
