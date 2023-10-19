// Developer: Rayyan Abdulmunib
// Date: 09/15/2023
// Class: CS 320 (Software Test Automation & QA)
// Description: This Contact Class entity represents a contact.


package ContactClass;

public class Contact 
{
	// Declare class properties or variable
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	/**
	 * Default constructor.
	 * @param contactID The contact's ID
	 * @param firstName The contact's first name
	 * @param lastName The contact's last name
	 * @param phone The contact's phone number
	 * @param address The contact's address
	 */
	public Contact(String contactID, String firstName, String lastName, String phone, String address)
	{
		if(contactID == null || contactID.length() > 10)
		{
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		if(firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if(lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if(phone == null || phone.length() > 10)
		{
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if(address == null || address.length() > 30)
		{
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	
	/**
	 * This method retrieves the contact's ID
	 */
	public String getContactID()
	{
		return contactID;
	}
	
	/**
	 * This method retrieves the contact's first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * This method sets or updates the contact's first name
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
	 * This method retrieves the contact's last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * This method sets or updates the contact's last name
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	/**
	 * This method retrieves the contact's phone number
	 */
	public String getPhoneNumber()
	{
		return phone;
	}
	
	/**
	 * This method sets or updates the contact's phone number
	 */
	public void setPhoneNumber(String phone)
	{
		this.phone = phone;
	}
		
	/**
	 * This method retrieves the contact's address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * This method sets or updates the contact's address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
}
