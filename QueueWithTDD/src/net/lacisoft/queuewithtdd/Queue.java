package net.lacisoft.queuewithtdd;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Queue {

	List<String> elements = new ArrayList<>();

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	public void add(String element) {
		elements.add(element);
	}

	public int size() {
		// TODO Auto-generated method stub
		return elements.size();
	}

	public String getFirst() {
		throwExceptionIfQueueIsEmpty();
		return elements.get(0);
	}

	public void leaveFirst() {
		throwExceptionIfQueueIsEmpty();
		elements.remove(0);
	}

	private void throwExceptionIfQueueIsEmpty() {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
	}

}
