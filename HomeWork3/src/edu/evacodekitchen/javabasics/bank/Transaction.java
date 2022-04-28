package edu.evacodekitchen.javabasics.bank;

import java.time.LocalDate;

import javax.lang.model.element.Element;

public class Transaction {

	private int amount;
	private LocalDate date;
	
	
	public Transaction(int amount, LocalDate date) {
		this.amount = amount; 
		this.date = date; 
	}
	public LocalDate getDate() {
		return date;
	}


}
