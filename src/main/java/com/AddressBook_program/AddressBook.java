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

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import javax.swing.filechooser.FileFilter;
import com.opencsv.CSVWriter;


public class AddressBook {

	public void writeAddressBook() throws IOException {
		
		  FileWriter outputfile = new FileWriter("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\AddressBook_Class_199\\written.csv");
	       
	         // create CSVWriter object filewriter object as parameter
	         CSVWriter writer = new CSVWriter(outputfile);
	       
	         // create a List which contains String array
	         ArrayList<String[]> addrsBook=new ArrayList<String[]>();
	 		addrsBook.add( new String[] {"FirstName","LastName","City","State","Zip","Email"});
	 		addrsBook.add( new String[] {"RamKrishna","Charan","Banglore","Chennai","441122","ramcharan@yahoo.com"});
	 		addrsBook.add( new String[] {"Bunty","Shelke","Nagpur","Maharashtra","441100","shelke@gmail.com"});
	 		addrsBook.add( new String[] {"Nikita","Patil","aurangabad","Maarashtra","445511","nikita@reddif.in"});
	 		writer.writeAll(addrsBook);
	         
	         writer.writeAll(addrsBook);
	       
//	         // closing writer connection
	     writer.close();

	}
	public void readAddressBook() throws IOException, Exception {
	
		  FileReader filereader = new FileReader("C:\\Users\\ASHUTOSH NAWALE\\eclipse-workspace\\AddressBook_Class_199\\written.csv");

	        // create csvReader object and skip first Line
	        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
	        List<String[]> allData = csvReader.readAll();

	        // print Data
	        for (String[] row : allData) {
	            for (String cell : row) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }

	}
	
	public static void main(String[] args) throws Exception {	
		AddressBook obj=new AddressBook();
		obj.writeAddressBook();
		obj.readAddressBook();
		
		
	}
}