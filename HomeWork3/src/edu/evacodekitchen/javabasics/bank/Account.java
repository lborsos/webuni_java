package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
		// TODO Auto-generated method stub
		return 500;
	}

	public void doTransaction(int amount, LocalDate date) {
		tranzactions.add(new Transaction(amount, date));
		
	}

	public List<Transaction> getTransactionsFor(LocalDate date) {
		return tranzactions;
	}

}
