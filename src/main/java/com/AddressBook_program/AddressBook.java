package com.AddressBook_program;

import java.util.Scanner;

public class AddressBook {
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	public int pincode;
	public String email;

	public AddressBook(String firstName, String lastName,String phoneNumber, String address
			, int pincode, String email) {

		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.pincode=pincode;
		this.email=email;
	}
	public void newAddressBookDataEnter() {
		System.out.println(firstName+" "+lastName+" "+phoneNumber+
				" "+address+" "+pincode+"  "+email);

	}
	public void changePhoneNumber(String change) {
		Scanner sc=new Scanner(System.in);
		if (change.equals(firstName)) {
			System.out.println("Enter The New Number");
			phoneNumber=sc.next();
			System.out.println(firstName+" "+lastName+" "+phoneNumber+
					" "+address+" "+pincode+"  "+email);
		}
	}
	public void Deletinfunc(String name) {
		if (firstName.equals(name)) {
		firstName=null;
		lastName=null;
		phoneNumber=null;
		address=null;
		pincode=0;
		email=null;
	System.out.println("The Data is Deleted");
	}
		else { System.out.println("The Data is Not Deleted");
		}
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name Enter");
		String firstName=sc.next();
		System.out.println("Last Name Enter");
		String lastName=sc.next();
		System.out.println("PhoneNumber Enter");
		String phoneNumber=sc.next();
		System.out.println(" Address Enter");
		String address=sc.next();
		System.out.println(" PinCode Enter");
		int pincode=sc.nextInt();
		System.out.println(" Email Enter");
		String email=sc.next();
		AddressBook obj=new AddressBook(firstName,lastName,phoneNumber,address,pincode,email);
		obj.newAddressBookDataEnter();
		System.out.println("If Change The Phone Number Enter Name & Dont change Enter 0");
		String value=sc.next();
		obj.changePhoneNumber(value);
		System.out.println("If Delete  The  Entery Write The Name");
		value=sc.next();
		obj.Deletinfunc(value);
	}

}
