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
		if (!onFile(name)) {
			Contact contact = new Contact(name, phoneNo);
			phoneBook.add(contact);
			System.out.println("Added contact: " + name +" - " + phoneNo);	
		}else {
			System.out.println("Contact with this name already exists.");
			System.out.println("Contact not added - try again.");
		}
	}
	
	public void modifyContact(String name, String phoneNo) {
				
	}
	
	private void modifyContact(int index, String name, String phoneNo ){
		
	}
	
	public void removeContact(String name) {
		int contactIndex = findContactIndex(name);
		if (onFile(name)) {
			removeContact(contactIndex);
			System.out.println("Contact :" + phoneBook.get(contactIndex).name +" - "+ phoneBook.get(contactIndex).phoneNumber + " removed.");
		} else {
			System.out.println("Contact not found.");
		}
	}
	
	public void searchContact(String name) {
		if (onFile(name)) {
			int contactIndex = findContactIndex(name);
			System.out.println("Search result:");
			System.out.println(phoneBook.get(contactIndex).name + " - " + phoneBook.get(contactIndex).phoneNumber);
		} else {
			System.out.println("Could not find contact: " + name);
		}
	}

	//// Private methods ////
	
	private void removeContact(int itemIndex){
		phoneBook.remove(itemIndex);
	}
	
	private int findContactIndex (String name) {
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
		if (findContactIndex(name) >=0 ) {
			return true;
		}
	return false;
	}
	
}