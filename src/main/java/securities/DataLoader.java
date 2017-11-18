package securities;

import entities.Role;
import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.RoleRepsository;
import repositories.UserRepository;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner
{
	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepsository roleRepository;


	@Override
	public void run(String... strings) throws Exception
	{
		System.out.println("Loading data...");

		roleRepository.save(new Role("USER"));
		roleRepository.save(new Role("ADMIN"));
		roleRepository.save(new Role("CEOROLE"));

//		Role adminRole = roleRepository.findByRole("ADMIN");
//		Role userRole = roleRepository.findByRole("USER");
//		Role ceoRole = roleRepository.findByRole("CEOROLE");

//
//		User user = new User("bruck","z" , "", "");
//		user.addRoles(userRole);
//		userRepository.save(user);
//
//		user = new User("sami","z" , "","");
//		user.addRoles(userRole);
//		userRepository.save(user);
//
//		user = new User("tg","z" , "","");
//		user.addRoles(userRole);
//		userRepository.save(user);
	}
}