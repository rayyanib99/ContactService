// Developer: Rayyan Abdulmunib
// Date: 09/15/2023
// Class: CS 320 (Software Test Automation & QA)
// Description: This ContactTest Class tests the Contact.java class.


package TestClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ContactClass.Contact;

class ContactTest 
{
	
	/**
	 * This test unit checks if the constructor or all the initial contact information is appropriate in the Contact.java class entity.
	 */
	@Test
	void testContactClass() 
	{
		Contact contact = new Contact("1234554321", "Cristopher", "Abdulmunib", "1234567890", "123 SNHU St.");
		assertTrue(contact.getContactID().equals("1234554321"));
		assertTrue(contact.getFirstName().equals("Cristopher"));
		assertTrue(contact.getLastName().equals("Abdulmunib"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 SNHU St."));
	}
	
	
	/**
	 * This test unit checks if the data validation on each data field or property in the Contact.java class entity meets the test requirements.
	 */
	@Test
	void dataValidations()
	{
		// Contact ID is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact(null, "Cristopher", "Abdulmunib", "1234567890", "123 SNHU St.");
		});
		
		// Contact ID is  too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("11111111111112222222222222", "Cristopher", "Abdulmunib", "1234567890", "123 SNHU St.");
		});
				
		// First name is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", null, "Abdulmunib", "1234567890", "123 SNHU St.");
		});
		
		// First name is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Alexander the Great", "Abdulmunib", "1234567890", "123 SNHU St.");
		});
		
		// Last name is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", null, "123456780", "123 SNHU St.");
		});
				
		// Last name is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", "Alexander the Great", "1234567890", "123 SNHU St.");
		});
		
		// Phone number is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", "Abdulmunib", null, "123 SNHU St.");
		});
		
		// Phone number is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", "Abdulmunib", "1234567898754321", "123 SNHU St.");
		});
				
		// Address is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", "Abdulmunib", "1234567890", null);
		});	
		
		// Address is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> 
		{
			Contact contact = new Contact("1234554321", "Cristopher", "Abdulmunib", "1234567890", "123000000000000000000000000000000000000000000000000000 SNHU St.");
		});
	}
}
