package com.AddressBook_program;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {
	static HashMap<Integer,String> map = new HashMap<Integer, String>();
	static Scanner sc=new Scanner(System.in);
	public static String newAddressBookDataEnter() {
		System.out.println("First Name Enter");
		String firstName=sc.next();
		System.out.println("Last Name Enter");
		String lastName=sc.next();
		System.out.println("PhoneNumber Enter");
		String phoneNumber=sc.next();
		System.out.println(" Address Enter");
		String address=sc.next();
		System.out.println(" PinCode Enter");
		String pincode=sc.next();
		System.out.println(" Email Enter");
		String email=sc.next();

		System.out.println(firstName+" "+lastName+" "+phoneNumber+
				" "+address+" "+pincode+"  "+email);
		return firstName+" "+lastName+" "+phoneNumber+
				" "+address+" "+pincode+"  "+email;

	}
	public static void storeData() {
		System.out.println("If address book add more Then Enter The  1");
		System.out.println("If address book add Nothing Then Enter The  0");
		System.out.println("If address book Show Then Enter The  2");
		int condition=sc.nextInt();
		switch(condition) {
		
		case(0): System.out.println("Your address Book Is  Save & Closed");
		         break;
		case(1):  System.out.println("Enter The Unique Value of Person");
		          int unique=sc.nextInt();
		          map.put(unique, newAddressBookDataEnter());
		          System.out.println(map.get(unique));
		          storeData();
		          break;
		case(2): Set<Integer> keys = map.keySet();
		         for (Object key : keys)
			     System.out.println("Keys :  "+key+" value:  "+map.get(key));      
		         break;
		default: System.out.println("Enter Correct Input");
		}
	}
	public static void main(String[] args) {		
		AddressBook.storeData();
	}
}
