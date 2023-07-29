package com.technospace.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandlingClass {

	public static void main(String[] args) throws IOException {
		
		//Display the data which  we stored in text file
		Stream<String> list = Files.lines(Path.of("C:\\Users\\Lenovo\\Desktop\\NotePad\\NameData.txt"));
		list.forEach(System.out::println);
		
		
		//Apply condition on the file data
 /*		List<String> list2 =  list.filter(x -> x.contains("R")).collect(Collectors.toList());
		System.out.println(list2);
		
		*/
	}

}
