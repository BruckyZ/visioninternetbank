package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.RoleRepsository;
import repositories.UserRepository;
import securities.SSUserDetailsService;


@Service
public class UserService
{
	@Autowired
	private SSUserDetailsService userDetailsService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepsository roleRepsository;

	@Autowired
	public UserService(RoleRepsository roleRepsository)
	{
		this.userRepository=userRepository;
	}

	public User findByEmail(String email)
	{
		return userRepository.findByEmail(email);
	}
	public Long countByEmail(String email)
	{
		return userRepository.countByEmail(email);
	}
	public User findByUsername(String username)
	{
		return userRepository.findByUsername(username);
	}

	public void saveRole(User user)
	{
		user.setRoles(roleRepsository.findByRole("USER"));
		userRepository.save(user);
	}

	public void saveadmin(User user)
	{
		user.setRoles(roleRepsository.findByRole("ADMIN"));
		userRepository.save(user);
	}
	public void saveceo(User user)
	{
		user.setRoles(roleRepsository.findByRole("CEOROLE"));
		userRepository.save(user);
	}

}
