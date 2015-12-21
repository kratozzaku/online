package krt;

import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<Contact> phoneBook = new ArrayList<Contact>();
	
	
	public void displayContacts(){
		System.out.println("*** PHONEBOOK ***\n");
		for (int i = 0; i < phoneBook.size(); i++) {
			System.out.println(i+1 + ". " + phoneBook.get(i).name + " - " + phoneBook.get(i).phoneNumber);
		}
	}

	public void addContact(String name, String phoneNo){
		
		// TODO Check if contact is already in the list
	
		Contact contact = new Contact(name, phoneNo);
		
			phoneBook.add(contact);
			System.out.println("Added contact: " + name +" - " + phoneNo);	

	}
	
	public void modifyContact(String name, String phoneNo) {
				
	}
	
	private void modifyContact(int index, String name, String phoneNo ){
		
	}
	
	public void removeContact(String name) {
		
	}
	
	public void searchContact(String name) {
		findItem(name);
	}
	
	private int findItem (String name) {
		int result = -1;
		for (int i = 0; i < phoneBook.size(); i++) {
			if (phoneBook.get(i).name.equals(name)) {
				result = i;
				return result;
			}
		}
	return result;	
	}
	
	private boolean onFile(String name){
		if (findItem(name) >=0 ) {
			return true;
		}
	return false;
	}
	
}