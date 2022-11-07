package com.AddressBook_program;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		return address+" "+phoneNumber+" "+pincode+" "+email;

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
	


    // Method to sort hashmap by values
    public static HashMap<String, String> sortByValue(HashMap<String, String> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, String> > list =
               new LinkedList<Map.Entry<String, String> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, String> >() {
            public int compare(Map.Entry<String, String> o1,
                               Map.Entry<String, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, String> temp = new LinkedHashMap<String, String>();
        for (Map.Entry<String, String> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
	
	public static void main(String[] args) {	
		
		AddressBook.storeData();
		Map<String, String> sortMap =sortByValue(map);
		 // print the sorted hashmap
        for (Map.Entry<String, String> map1 : sortMap.entrySet()) {
            System.out.println("Key = " + map1.getKey() +
                          ", Value = " + map1.getValue());
        }
	}
}