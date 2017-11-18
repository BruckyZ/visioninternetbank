package entities;

import javax.persistence.*;
import java.util.Set;

public class Transaction
{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;

	private long withdrowal;

	private long deposit;

	private long amount;

	private String reason;

	@ManyToMany(mappedBy = "accounts",fetch=FetchType.LAZY)
	private Set<Accounts> accounts;


	public Transaction(long withdrowal, long deposit, long amount, String reason, Set<Accounts> accounts)
	{
		this.withdrowal = withdrowal;
		this.deposit = deposit;
		this.amount = amount;
		this.reason = reason;
		this.accounts = accounts;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getWithdrowal()
	{
		return withdrowal;
	}

	public void setWithdrowal(long withdrowal)
	{
		this.withdrowal = withdrowal;
	}

	public long getDeposit()
	{
		return deposit;
	}

	public void setDeposit(long deposit)
	{
		this.deposit = deposit;
	}

	public long getAmount()
	{
		return amount;
	}

	public void setAmount(long amount)
	{
		this.amount = amount;
	}

	public String getReason()
	{
		return reason;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public Set<Accounts> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(Set<Accounts> accounts)
	{
		this.accounts = accounts;
	}
}
