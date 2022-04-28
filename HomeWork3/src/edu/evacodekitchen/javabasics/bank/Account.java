package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Account {

	private String owner;
	private String id;
	private List<Transaction> tranzactions;

	public Account(String owner, String id) {
		this.owner = owner;
		this.id = id;
		this.tranzactions = new ArrayList<>();
	}

	public int getBalance() {
		return tranzactions.stream().mapToInt(i -> i.getAmount()).sum();
	}

	public void doTransaction(int amount, LocalDate date) {
		if (getBalance() + amount < 0) {
			throw new TooLowBalanceException();
		}
		tranzactions.add(new Transaction(amount, date));
	}

	public List<Transaction> getTransactionsFor(LocalDate date) {
		return tranzactions.stream().filter(x -> x.getDate().equals(date)).collect(Collectors.toList());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(id, other.id) && Objects.equals(owner, other.owner);
	}

}
