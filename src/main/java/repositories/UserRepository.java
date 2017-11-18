package repositories;

import entities.Role;
import entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUsername(String username);
	User findByEmail(String email);
	Long countByEmail(String email);
	Long countByUsername(String username);
	Long findbyMangername(String managername);
	Long findbyCEOname(String ceoname);
}
