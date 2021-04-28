/*
 * After learning about Inheritance, you try to test your understanding by building a Phone class that will
represent phones and a class that inherits from this class called SmartPhone which represents phones that
have access to World Wide Web. The Phone class will have one instance variable to represent the model
of the phone.  
 */
public class Phone {
	//instance variables
	private String model;
	
	public Phone() {
		//default constructor
		model = "";
	}
	//public Phone(String newModel) {
		//overloading constructor
		//model = newModel;
	//}
	//non-static methods
	public void setModel(String newModel) {
		model = newModel;
	}
	public String getModel() {
		return model;
	}
	
}
