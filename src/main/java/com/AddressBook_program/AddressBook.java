package com.AddressBook_program;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> store=new ArrayList<String>();
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
		case(1):  store.add(newAddressBookDataEnter());
		          storeData();
		          break;
		case(2):      System.out.println(store.toString());   
		          break;
	    default: System.out.println("Enter Correct Input");
		}
	}
	
	public static void main(String[] args) {		
		AddressBook.storeData();
	}
}
