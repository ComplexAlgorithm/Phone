/*
 * After developing these two classes, build a demo class that creates an object of the Phone class and an
object of the SmartPhone class. The program should give the user five options. The first option will
allow the user to enter the information about their phone. The second option will allow the user to enter
the information about their smart phone. The third option will allow the user to look at or review the
information about their phone. The fourth option will allow the user to look at or review the information
about their smart phone. The fifth option should end the program. If any other option is selected the user
should be given an error message and given another chance to choose of one of the options. 
 */
import java.util.Scanner;
public class PhoneAndSmartPhoneDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Phone currentPhone = null; //reference to a phone object
		SmartPhone currentSmartPhone = null; //reference to a smart phone object
		
		int option;

		do {
			System.out.println("Press 1 to enter information about your phone.");
			System.out.println("Press 2 to enter information about your smart phone.");
			System.out.println("Press 3 to review the information about your phone.");
			System.out.println("Press 4 to review the information about your smart phone.");
			System.out.println("Press 5 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				currentPhone = new Phone();
				enterModel(currentPhone);
			}
			else if(option == 2) {
				currentSmartPhone = new SmartPhone();
				enterModel(currentSmartPhone);
				enterWebAddress(currentSmartPhone);
			}
			else if(option == 3) {
				if(currentPhone != null) {
					System.out.println("Phone Model: " + currentPhone.getModel());
				}
			}
			else if(option == 4) {
				if(currentSmartPhone != null) {
					System.out.println("Smart Phone Model: " + currentSmartPhone.getModel());
					System.out.println("Current Web Address: " + currentSmartPhone.getWebAddress());
				} 
			}
			else if(option == 5) {
				System.out.println("Goodbye! Thank you for using my program!");
			}
			else {
				System.out.println("Error! Please pick a valid option!");
			}
			
		}while(option != 5);
	}
	public static void enterModel(Phone m) {
		Scanner keyboard = new Scanner(System.in);
		if(m != null) {
			System.out.println("What is the model of your phone?");
			String model = keyboard.nextLine();
			m.setModel(model);
		}
	}
	public static void enterWebAddress(SmartPhone w) {
		Scanner keyboard = new Scanner(System.in);
		if(w != null) {
			System.out.println("Whats the current web address open on your smart phone?");
			String webAddress = keyboard.nextLine();
			w.setWebAddress(webAddress);
		}
	}

}


