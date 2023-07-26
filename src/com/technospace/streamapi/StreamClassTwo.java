package com.technospace.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamClassTwo {

	public static void main(String[] args) {
		
String[] name = {"Swamini", "Raj", "Pavan", "Rajvardhan", "", "Naman", "", "", "Mrunal", "Madhuri"};
		
		
		
		//List Collection Object
		List<String> nameList = Arrays.asList(name);
		
		
		//find the name which have R letter
		int countName = (int) nameList.stream().filter(x -> x.contains("R")).count();
		System.out.println("How many object contain R ? :"+countName);
		
		
		//Count length of given name
		long countName2 = nameList.stream().filter(x -> x.length() >= 5).count();
		System.out.println("How many objects has length greater than 5 ? :"+countName2);	
		
		
		
		nameList.stream().filter(x -> x.contains("M")).forEach(x -> System.out.println(x));
	}

}
