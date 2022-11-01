package com.AddressBook_program;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JList;

public class AddressBook {
	static HashMap<String,String> map = new HashMap<String, String>();
	static Scanner sc=new Scanner(System.in);
	
	public static String uniquenessData() {
		System.out.println("First Name Enter");
		String firstName=sc.next();
		System.out.println("Last Name Enter");
		String lastName=sc.next();
		return firstName+" "+lastName;
	}
	
	
	public static String newAddressBookDataEnter() {
		System.out.println("PhoneNumber Enter");
		String phoneNumber=sc.next();
		System.out.println(" Address Enter");
		String address=sc.next();
		System.out.println(" PinCode Enter");
		String pincode=sc.next();
		System.out.println(" Email Enter");
		String email=sc.next();

		System.out.println(phoneNumber+
				" "+address+" "+pincode+"  "+email);
		return phoneNumber+" "+address+" "+pincode+"  "+email;

	}
	public static void storeData() {
		System.out.println("If address book add Nothing Then Enter The  0");
		System.out.println("If address book add Details Then Enter The  1");
		System.out.println("If address book Show Then Enter The  2");
		int condition=sc.nextInt();
		switch(condition) {
		
		case(0): System.out.println("Your address Book Is  Save & Closed");
		         break;
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
		case(2): Set<String> keys2 = map.keySet();
		         for (Object key : keys2)
			     System.out.println("Keys :  "+key+" value:  "+map.get(key));      
		         break;
		default: System.out.println("Enter Correct Input");
		}
	}
	public static void main(String[] args) {		
		AddressBook.storeData();
	}
}