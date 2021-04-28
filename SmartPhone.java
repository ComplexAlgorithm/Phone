/*
 * SmartPhone will inherit from the Phone class and will have one instance variable that
stores the web address of the page that the phone is currently on. Each class should be built using object 
oriented methodology by making its instance variables private and developing public methods to access
and mutate the instance variables of each class. The public methods of Phone will be inherited by
SmartPhone and should not be duplicated in the SmartPhone class. These classes do not need to override
any methods from the Object class.
 */
public class SmartPhone extends Phone{
	//instance variables
	private String webAddress;
	
	public SmartPhone() {
		//default constructor
		super();
		webAddress = "";
	}
	//non-static methods
	public void setWebAddress(String newWebAddress) {
		webAddress = newWebAddress;
	}
	public String getWebAddress() {
		return webAddress;
	}
}
