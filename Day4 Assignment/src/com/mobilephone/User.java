package com.mobilephone;

public class User {
	
	public static void main(String[] args) {
	
		 Contact c1 = Contact.addContact("Ravan ", "01+87538305");
		 Contact c2 = Contact.addContact("Kumbhkaran", "01+87538306");
		 Contact c3 = Contact.addContact("Meghnath",   "01+87538307");
		 Contact c4 = Contact.addContact("LavnaSur ", "01+87538308");
		 Contact c5 = Contact.addContact("Vibhisan", "01+875383069");
		
		 Contact c6 = new Contact("Vibhisan Kumar ", "+91 8769587941");
		 
		 MobilePhone mPhone = new MobilePhone();
		 
		 mPhone.addNewContact(c1);
		 mPhone.addNewContact(c2);
		 mPhone.addNewContact(c3);
		 mPhone.addNewContact(c4);
		 mPhone.addNewContact(c5);
		 
		 System.out.println(" Meghnath -->  Vibhisan Prabhu ram ka Bhakt hai, hume Dhokha dera hai, Pata lagao kha hai vo ?");
		 System.out.println();
		 System.out.println(" Ye Dekho saboot - Vibhisan  "+mPhone.queryContact("Vibhisan") +"and  Vibhisan at room No. - "+ mPhone.findContact(c5)); 
		 System.out.println();
		 System.out.println(" Ravan -> Vibhisan tum apna team change kar diye, kha ka liya ho Naye Number  ? " );
		 System.out.println();
		 mPhone.updateContact(c5, c6);
		 System.out.println(" Vibhishan -> Ye rahe mere nye Number -> "+ c6 );
		 System.out.println();
		 System.out.println();
		 System.out.println(" Ravan --> Kya.....?  tum Bharat me jare Ho, Ram ki team me  ho lgta hai ? ");
		 System.out.println(" Ravan --> Nikalo ise yha se......");
		 System.out.println();
		 mPhone.removeContact(c6);
		 mPhone.printContact();
		 
		 
		 
		
	}
}
