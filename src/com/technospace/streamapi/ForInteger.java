package com.technospace.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForInteger {

	public static void main(String[] args) {
		
		Integer[] numberIntegers = {9, 8, 7, 4, 9, 6, 3, 7, 8, 3};
		
		List<Integer> numberList = Arrays.asList(numberIntegers);
		
		//Square root of all given numbers 
		List<Integer> newList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("Square Root :"+newList);

		//Square Root of all given numbers without duplication
		List<Integer> newList2 = numberList.stream().map(x -> x*x).distinct().collect(Collectors.toList());
		System.out.println("Square Root :"+newList2);
		
		//Square Root of given number with ascending order
		List<Integer> newList3 = numberList.stream().map(x -> x*x).distinct().sorted().collect(Collectors.toList());
		System.out.println("Square Root with Ascending Oredr :"+newList3);
		
	}

}
