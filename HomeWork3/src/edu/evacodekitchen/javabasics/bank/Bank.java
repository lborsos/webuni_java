package edu.evacodekitchen.javabasics.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {

	List<Account> elements = new ArrayList<>();
	
	public void addAccount(Account account) {
		elements.add(account);
	}

	public List<Account> getAccounts() {
		return elements;
	}

	public List<Account> getPremiumAccounts() {
		return elements.stream().filter(x -> x.getBalance() > 12000).collect(Collectors.toList());
//		return (List<Account>) elements.stream().filter(x -> x.getBalance() > 12000).findAny().get();
	}

}
