package repositories;

import entities.Accounts;
import entities.Role;
import org.springframework.data.repository.CrudRepository;


public interface AccountsRepsository extends CrudRepository<Accounts, Long>
{
	Accounts findByaccounts(long Accounts);
	Accounts findBybalance(long balance);

}


