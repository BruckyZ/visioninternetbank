package entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class User
{

	@Entity
	public class UserData
	{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		private String firstName;

		private String lastName;

		private String cellnumber;

		private String email;

		private String password;

		private String username;

		private String managername;

		private String ceoname;


		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
		private Set<Role> roles;


		public Set<Accounts> getAccounts()
		{
			return accounts;
		}

		public void setAccounts(Set<Accounts> accounts)
		{
			this.accounts = accounts;
		}

		@OneToMany(mappedBy = "accounts",fetch=FetchType.LAZY)
		private Set<Accounts> accounts;

		public UserData(String firstName, String lastName, String cellnumber, String email, String password, String username, String managername, String ceousername, Set<Role> roles)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.cellnumber = cellnumber;
			this.email = email;
			this.password = password;
			this.username = username;
			this.managername = managername;
			this.ceoname = ceousername;
			this.roles = roles;
			this.accounts=accounts;
		}

		public long getId()
		{
			return id;
		}

		public void setId(long id)
		{
			this.id = id;
		}

		public String getFirstName()
		{
			return firstName;
		}

		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}

		public String getLastName()
		{
			return lastName;
		}

		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}

		public String getCellnumber()
		{
			return cellnumber;
		}

		public void setCellnumber(String cellnumber)
		{
			this.cellnumber = cellnumber;
		}

		public String getEmail()
		{
			return email;
		}

		public void setEmail(String email)
		{
			this.email = email;
		}

		public String getPassword()
		{
			return password;
		}

		public void setPassword(String password)
		{
			this.password = password;
		}

		public String getUsername()
		{
			return username;
		}

		public void setUsername(String username)
		{
			this.username = username;
		}

		public String getManagername()
		{
			return managername;
		}

		public void setManagername(String managername)
		{
			this.managername = managername;
		}

		public String getCeoname()
		{
			return ceoname;
		}

		public void setCeoname(String ceousername)
		{
			this.ceoname = ceousername;
		}

		public Set<Role>getRoles()
		{
			return roles;
		}


		public void setRoles(Set<Role> roles)
		{
			this.roles = roles;
		}

		public UserData() {
			roles = new HashSet<>();
		}
		public void addRoles
				(Role aRole) {
			roles.add(aRole);
		}
		public void addaddaccount
				(Accounts aaccount) {
			accounts.add(aaccount);
		}
	}
}

