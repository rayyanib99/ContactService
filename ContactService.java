// Developer: Rayyan Abdulmunib
// Date: 09/15/2023
// Class: CS 320 (Software Test Automation & QA)
// Description: This ContactService Class should be able to edit contacts: add, delete, and update certain fields of the contacts.


package ContactClass;

import java.util.ArrayList;

public class ContactService
{
	// Initialize a Contacts list
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	/**
	 * This method adds a new contact based on a unique ID.
	 * @param newContact The contact to be added
	 */
	public String addContact(Contact newContact)
	{
		boolean isUnique = true;
		
		for(int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).equals(newContact))
			{
				isUnique = false;
			}
			
			else {}
		}
		
		if(isUnique == true)
		{
			contactList.add(newContact);
			return "Contact Added.";
		}
		
		else	
		{
			return "Contact Exists Already.";
		}
	}
	
	
	/**
	 * This method deletes a contact based on a contact ID.
	 * @param contactID The contact ID of the contact to be deleted
	 */
	@SuppressWarnings("unlikely-arg-type")
	public String deleteContact(String contactID)
	{
		boolean isValid = false;
		
		for(int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).getContactID().equals(contactID))
			{
				isValid = true;
				contactList.remove(contactList.get(i).getContactID().equals(contactID));
			}
			
			else {}
		}
		
		if(isValid == true)
		{
			return "Contact Deleted.";
		}
		
		else	
		{
			return "Contact Not Found.";
		}
	}
	
	
	/**
	 * This method updates the first name, last name, phone number, and address of a new contact based on a contact ID.
	 * @param contactID The contact ID of the contact to be used to update the following fields
	 * @param firstName The first name of the contact to be updated
	 * @param lastName The last name of the contact to be updated
	 * @param phone The phone number of the contact to be updated
	 * @param address The address of the contact to be updated
	 */
	public String updateContact(String contactID, String firstName, String lastName, String phone, String address)
	{
		boolean isValid = false;
		
		for(int i = 0; i < contactList.size(); i++)
		{
			if(contactList.get(i).getContactID().equals(contactID))
			{
				isValid = true;
				contactList.get(i).setFirstName(firstName);
				contactList.get(i).setLastName(lastName);
				contactList.get(i).setPhoneNumber(phone);
				contactList.get(i).setAddress(address);
			}
			
			else {}
		}
		
		if(isValid == true)
		{
			return "Contact Updated.";
		}
		
		else	
		{
			return "No Contact Found.";
		}
	}	
}
