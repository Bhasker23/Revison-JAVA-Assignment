package com.mobilephone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobilePhone {
	
	 String myNumber;
     List<Contact> myContacts = new ArrayList<>();
	
	public MobilePhone() {
		// TODO Auto-generated constructor stub
	}

	public MobilePhone(String myNumber, List<Contact> myContacts) {
		super();
		this.myNumber = myNumber;
		this.myContacts = myContacts;
	}
	
	public int findContact(Contact c){
		
		int pos = -1;		
		if(myContacts.contains(c)) {
			 pos = myContacts.indexOf(c);
		}
		return pos;
	}
	
	public boolean addNewContact(Contact c) {
		
		boolean jwab = true;
		
		int pos = findContact(c);
		if(pos >= 0 ) {
			jwab = false;
			return jwab;
		}
		else {
			myContacts.add(c);
			return jwab;
		}
		
	}
	
	
	public boolean updateContact(Contact old, Contact n) {
		
		boolean jwab = true;
		
		int pos  = findContact(old);
		
		if(pos >= 0) {
			myContacts.set(pos, n);
			return jwab;
		}else {
			return jwab = false;
		}	
	}
	
	public boolean removeContact(Contact c) {
		boolean jwab = true;
		
		int pos = findContact(c);
		
		if (pos >= 0) {
			myContacts.remove(pos);
			return jwab;
		}else {
			return jwab = false;
		}	
	}
	
	public Contact queryContact(String name) {
		
		for (Contact contact : myContacts) {
	        if (contact.getName().equals(name)) {
	            return contact;
	        }
	    }
	    return null;
	}
	
	public void printContact() {
		
		int num = 1;
		System.out.println(" Contact List ");
		for (Contact contact : myContacts) {
			System.out.println(num+" "+contact.getName()+" -> "+contact.getNumber());
			num++;
		}
	}
	
}
