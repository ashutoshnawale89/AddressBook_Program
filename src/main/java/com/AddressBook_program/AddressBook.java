package com.AddressBook_program;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.filechooser.FileFilter;


public class AddressBook {

	public void writeAddressBook() throws IOException {
		ArrayList<String> addrsBook=new ArrayList<String>();
		addrsBook.add("Nikita");	
		addrsBook.add("Patil");
		addrsBook.add("7755889944");
		addrsBook.add("Aurangabad");
		addrsBook.add("Maharastra");
		addrsBook.add("445566");
		addrsBook.add("nikita@gmail.com");
		Files.write(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\AddressBook_Class_199\\AddressBook.txt"),addrsBook, StandardOpenOption.APPEND);
	}
	public void readAddressBook() throws IOException, Exception {
	
		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\AddressBook_Class_199\\AddressBook.txt"));

		// Printing Lines Read
		for (String line : lines) {
			System.out.println(line);
		}		
	}
	
//	FileReader fileReader =null;
//	try {
//		fileReader=new FileReader(infile);
//		int ch;
//		while((ch=fileReader.read())!= -1) {
//			System.out.print((char)ch);
//		}
//	}
//	catch (FileNotFoundException fnfe)
//    {
//        System.out.println("NO Such File Exists");
//    }
//    catch (IOException except)
//    {
//        System.out.println("IOException occurred");
//    }
//	  finally {
//		  fileReader.close(); 
//	}
//	}
//		
	public static void main(String[] args) throws Exception {	
		AddressBook obj=new AddressBook();
		obj.writeAddressBook();
		obj.readAddressBook();
		
		
	}
}