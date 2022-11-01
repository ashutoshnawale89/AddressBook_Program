package com.AddressBook_program;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JList;

public class AddressBook {
	// hashmap is used to Uniqueness
	static HashMap<String,String> map = new HashMap<String, String>();
	static Scanner sc=new Scanner(System.in);

	//   Hashmap Keys pair is used to store the first & last Name 
	public static String uniquenessData() {
		System.out.println("First Name Enter");
		String firstName=sc.next();
		System.out.println("Last Name Enter");
		String lastName=sc.next();
		return firstName+" "+lastName;
	}

	// hashmap value pair is used to store the other details of person
	public static String newAddressBookDataEnter() {
		System.out.println(" Address Enter");
		String address=sc.next();
		System.out.println("PhoneNumber Enter");
		String phoneNumber=sc.next();
		System.out.println(" PinCode Enter");
		String pincode=sc.next();
		System.out.println(" Email Enter");
		String email=sc.next();
		return phoneNumber+" "+address+" "+pincode+" "+email;

	}

	// this method operate all methods
	public static void storeData() {
		System.out.println("If address book add Nothing Then Enter The  0");
		System.out.println("If address book add Details Then Enter The  1");
		System.out.println("If address book Show Then Enter The  2");
		int condition=sc.nextInt();
		switch(condition) {

		case(0): System.out.println("Your address Book Is  Save & Closed");
		break;
		//   this case is used to find the uniqueness and fill the detail of person
		case(1):  
			int count=0;
		String unique=uniquenessData();
		Set<String> keys1 = map.keySet();
		for (Object key : keys1)
			if(key.equals(unique)) {
				System.out.println("Name is Alredy Given in Address Book");
				count++;
				break;
			}
		if(count==0) {
			map.put(unique, newAddressBookDataEnter());
		}
		storeData();
		break;
		//    this case used to print the all hashmap or addressbook details
		case(2): Set<String> keys2 = map.keySet();
		for (Object key : keys2)
			System.out.println("Keys :  "+key+" value:  "+map.get(key));      
		break;
		default: System.out.println("Enter Correct Input");
		}
	}

	public static void searchPersonInCity(String city) {
		//  initiating the value and "count" value use for the NO PERSON PRESENT IN CITY
		String str;
		String[] arrOfStr;
		int count=0;
		//  for loop for HASHMAP
		Set<String> keys2 = map.keySet();
		for (Object key : keys2) {
			str=map.get(key);
			//  Split The HashMAP Value Pair 
			arrOfStr = str.split(" ", 4);
			for (String temp : arrOfStr) {
				// splittd Value will be compare to the City
				if(temp.equals(city)){
					System.out.println("Keys :  "+key+" value:  "+str); 
					count++;
				}
			}
		}
		System.out.println(count+"  number of person stay in the "+city);
		// count will null it means No One Available in City
		if (count==0)
			System.out.println("No Deails available");
	}
	// Sorted By Person name using Stream Api Function 
	public static void sortAphabeticallyByPersonName() {
		map.keySet().stream().sorted((a1, a2) -> a2.compareTo(a1)).forEach(x -> System.out.println(x));
  
	}
	
	public static void main(String[] args) {	
		
		AddressBook.storeData();
	//	System.out.println("Search Result to show multiple person in the city or state");
	//	searchPersonInCity("nagpur");
		sortAphabeticallyByPersonName();
	}
}