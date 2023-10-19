// Developer: Rayyan Abdulmunib
// Date: 09/15/2023
// Class: CS 320 (Software Test Automation & QA)
// Description: This ContactServiceTest Class tests the ContactService.java class.


package TestClass;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import ContactClass.Contact;
import ContactClass.ContactService;

class ContactServiceTest 
{
	// Instantiate three contacts using the Contact class-objects
	Contact contact = new Contact("1234554321", "Cristopher", "Gregory", "1234567890", "123 Hadoop Rd.");
	Contact contact2 = new Contact("1234554322", "Rayyan", "Abdulmunib", "1234587890", "123 SNHU St.");
	Contact contact3 = new Contact("1234554323", "Cipher", "Roader", "1234367890", "123 Jadoo Blvd.");
	
	// Instantiate a ContactService class-object
	ContactService contactService = new ContactService();
	
	
	/**
	 * This test unit checks if the addContact method in the ContactService.java class meets the test requirements.
	 */
	@Test
	 void testAddContact() 
	 {
		assertEquals("Contact Added.", contactService.addContact(contact));
		assertEquals("Contact Added.", contactService.addContact(contact2));
		assertEquals("Contact Exists Already.", contactService.addContact(contact2));
		assertEquals("Contact Added.", contactService.addContact(contact3));
		assertEquals("Contact Exists Already.", contactService.addContact(contact3));
	}
	
	
	/**
	 * This test unit checks if the deleteContact method in the ContactService.java class meets the test requirements.
	 */
	@Test
	public void testDeleteContact() 
	{
		assertEquals("Contact Added.", contactService.addContact(contact));
		assertEquals("Contact Added.", contactService.addContact(contact2));
		assertEquals("Contact Added.", contactService.addContact(contact3));
		assertEquals("Contact Deleted.", contactService.deleteContact("1234554321"));
		assertEquals("Contact Deleted.", contactService.deleteContact("1234554322"));
		assertEquals("Contact Deleted.", contactService.deleteContact("1234554323"));
	}
	
	
	/**
	 * This test unit checks if the updateContact method in the ContactService.java class meets the test requirements.
	 */
	@Test
	public void testUpdateContact() 
	{
		assertEquals("Contact Added.", contactService.addContact(contact));
		assertEquals("Contact Added.", contactService.addContact(contact2));
		assertEquals("Contact Added.", contactService.addContact(contact3));
		
		// Update first name
		assertEquals("Contact Updated.", contactService.updateContact("1234554321", "Hugo", "Gregory", "1234567890", "123 Hadoop Rd."));
		assertEquals(contact.getFirstName(), "Hugo");
		
		// Update phone number
		assertEquals("Contact Updated.", contactService.updateContact("1234554321", "Hugo", "Gregory", "0101010101", "123 Hadoop Rd."));
		assertEquals(contact.getPhoneNumber(), "0101010101");
		
		// Update first and last name
		assertEquals("Contact Updated.", contactService.updateContact("1234554322", "Great", "Alexander", "1234587890", "123 SNHU St."));
		assertEquals(contact2.getFirstName(), "Great");
		assertEquals(contact2.getLastName(), "Alexander");
		
		// Update first name, last name, and address
		assertEquals("Contact Updated.", contactService.updateContact("1234554323", "Cyan", "Julia", "1234367890", "123 Hippo Blvd."));
		assertEquals(contact3.getFirstName(), "Cyan");
		assertEquals(contact3.getLastName(), "Julia");
		assertEquals(contact3.getAddress(), "123 Hippo Blvd.");
	}
}
