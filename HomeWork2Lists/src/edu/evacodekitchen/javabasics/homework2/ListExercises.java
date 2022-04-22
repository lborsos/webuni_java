package edu.evacodekitchen.javabasics.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExercises {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 1, 8, 3, -4, 9);
		System.out.println("min: " + findMin(numbers));
		System.out.println("max: " + findMax(numbers));
		System.out.println("odd numbers: " + findOddNumbers(numbers));
		System.out.println("sum of elements: " + sumOfElements(numbers));
	}

	public static int findMin(List<Integer> numbers) {
		return Collections.min(numbers);
	}

	public static int findMax(List<Integer> numbers) {
		return Collections.max(numbers);
	}

	public static List<Integer> findOddNumbers(List<Integer> numbers) {
		List<Integer> oddNumbers = new ArrayList<>();
		for(int val : numbers) {
			   if (val % 2 == 1) {
			      oddNumbers.add(val);
			   }
			}
		return oddNumbers;
	}

	public static Integer sumOfElements(List<Integer> numbers) {
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}

}
