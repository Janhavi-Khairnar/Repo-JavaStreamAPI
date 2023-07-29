package com.technospace.streamapi;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.auth.x500.X500Principal;

public class MapClass {

	public static void main(String[] args) {
	
		String[] name = {"Raj", "Raman", "Swamin", "",  "Kartik", "Mrunal", "Rashmi"};
		
		List<String> nameList = Arrays.asList(name);
		
		//All string are converted in upper case
		List<String> nameList2 =  nameList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println("Name's in upper Case :"+nameList2);
		
		//All string are converted in upper case without empty String
		List<String> nameList3 =  nameList.stream().map(x -> x.toUpperCase()).filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Without Empty String :"+nameList3);
		
	}

}
