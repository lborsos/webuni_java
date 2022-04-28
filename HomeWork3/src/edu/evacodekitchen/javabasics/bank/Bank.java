package edu.evacodekitchen.javabasics.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	List<Account> elements = new ArrayList<>();
	
	public void addAccount(Account account) {
		elements.add(account);
	}

	public List<Account> getAccounts() {
		return elements;
	}

	public List<Account> getPremiumAccounts() {
		// TODO
		return elements;
	}

}
