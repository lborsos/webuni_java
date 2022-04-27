package net.lacisoft.queuewithtdd;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	private Queue queueUnderTest;

	@BeforeEach
	void beforeEachTestMethod( ) {
		queueUnderTest = new Queue();
	}
	
	@Test
	void emptyQueueCanBeCreated() {
		//when
		boolean isEmpty = queueUnderTest.isEmpty();
		
		//then
		Assertions.assertTrue(isEmpty);
	}

	@Test
	void elementShouldBeAdded() {
		//when
		queueUnderTest.add("SomeElement");
		
		//then
		Assertions.assertEquals(1, queueUnderTest.size());
	}
	
	@Test
	void queueShouldNotBeEmptyAfterElementsIsAdded() {
		//when
		queueUnderTest.add("SomeElement");
		
		//then
		Assertions.assertFalse(queueUnderTest.isEmpty());
	}

	@Test
	void firstElementShouldBeRetrieved() {
		//when
		queueUnderTest.add("someElement");
		
		//then
		Assertions.assertEquals("someElement", queueUnderTest.getFirst());
		
	}
	
	@Test
	void firstElementShouldBeDeleted() {
		//given
		queueUnderTest.add("someElement1");
		queueUnderTest.add("someElement2");
		queueUnderTest.add("someElement3");
		
		//when
		queueUnderTest.leaveFirst();
		
		//then
		Assertions.assertEquals("someElement2", queueUnderTest.getFirst());
		
	}

	@Test
	void exceptionShouldBeThrowWhenFirstElementIsTriedToBeRetrievedFromEmptyQueue() {
		//when
//		queueUnderTest.leaveFirst();
		
		//then
		Assertions.assertThrows(QueueEmptyException.class, () -> queueUnderTest.getFirst());
		
	}
}
