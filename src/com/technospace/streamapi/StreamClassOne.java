package com.technospace.streamapi;

public class StreamClassOne {

	public static void main(String[] args) {
		
String[] name = {"Raj", "Pavan", "Rajvardhan", "", "Naman", "", "", "Mrunal"};
		
		System.out.println("Length of Name Array :"+name.length);
		System.out.println("\n");
		
		int count = 0;
		int count1=0;
		int i;
		
		//  1) Count of length of that object which has length more than 5
		for(i=0; i<name.length; i++) {
			if(name[i].length() >= 5) {
				System.out.println("Name of that String :"+name[i]+"\t\t\tLength :"+name[i].length());
				count++;
			}
		}
		System.out.println("\nHow many object having length greater than 5 ? : "+count);
		
		
		
		//  2) find the Name which initial letter is R or r
		for(i=0; i<name.length; i++) {
			if(name[i].contains("R") || name[i].contains("r")) {
				//System.out.println("R :"+name.contains("R"));
				count1++;
			}
		}
		System.out.println("\nHow many objects contain R ?  :"+count1);
	}


}


