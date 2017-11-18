package entities;

import javax.persistence.*;
import java.util.Set;

public class Accounts
{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;

	private long balance;


	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name="account_id"),inverseJoinColumns = @JoinColumn(name="transaction_id"))
	private Set<Transaction> transactions;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name="account_id"),inverseJoinColumns = @JoinColumn(name="transaction_id"))
	private Set<User> users;

	public Accounts(long balance, Set<Transaction> transactions, Set<User> users)
	{
		this.balance = balance;
		this.transactions = transactions;
		this.users = users;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getBalance()
	{
		return balance;
	}

	public void setBalance(long balance)
	{
		this.balance = balance;
	}

	public Set<Transaction> getTransactions()
	{
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions)
	{
		this.transactions = transactions;
	}

	public Set<User> getUsers()
	{
		return users;
	}

	public void setUsers(Set<User> users)
	{
		this.users = users;
	}
}
