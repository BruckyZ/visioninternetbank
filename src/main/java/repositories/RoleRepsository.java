package repositories;

import entities.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepsository extends CrudRepository<Role, Long>
	{
		Role findByRole(String role);

	}


