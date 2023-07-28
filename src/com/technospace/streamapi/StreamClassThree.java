package com.technospace.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassThree {

	public static void main(String[] args) {
		
		String[] name = {"Swamini", "Raj", "Pavan", "Rajvardhan", "", "Naman", "", "", "Mrunal", "Madhuri"};
	
		//List Collection Object
		List<String> nameList = Arrays.asList(name);
		
		List<String> noEmptyList = nameList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());

		System.out.println(noEmptyList);
		
	}

}
