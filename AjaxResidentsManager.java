/**
 * 
 */
package ajax;

import java.util.*;
import java.util.ArrayList;
import java.io.*;

/**
 * @author uchej
 *
 */
public class AjaxResidentsManager {

	private int houseRent;
	private int energyBill;
	private int internetBill;
	private int tvStreamingBill;
	private int garbageBill;

	Scanner scnr = new Scanner(System.in);

	// Default constructor for residential bills
	AjaxResidentsManager() {

	}

	// Parametric constructor for Ajax Apartment residential bills
	AjaxResidentsManager(int houseRent, int energyBill, int internetBill, int tvStreamingBill, int garbageBill) {

		this.houseRent = houseRent;
		this.energyBill = energyBill;
		this.internetBill = internetBill;
		this.tvStreamingBill = tvStreamingBill;
		this.garbageBill = garbageBill;

	}

	// This function gets house bills for residents
	public int getHouseRent() {

		System.out.println("Your house rent is: $950");
		return houseRent;
	}

	// This function sets residents house bill
	public void setHouseRent(int houseRent) {

		this.houseRent = houseRent;
	}

	// This function gets energy bill for the residents
	public void getEnergyBill() {

		int energyCharge;
		int fixedCharge = 10;
		int electricityDuty = 15;

		System.out.println("Enter amount on your meter charge");

		try {
			energyCharge = scnr.nextInt();
			if (energyCharge > 0) {
				System.out.println("Fixed charge = $10 \n");
				System.out.println("Electricity duty = $15\n");
				energyBill = energyCharge + fixedCharge + electricityDuty;
				System.out.println("Total bill =  $" + energyBill);

			}

			else {

				System.out.println("Amount must be greater than 0");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid entry");
		}

	}

//This function sets energy bill for the residents
	public void setEnergyBill(int energyBill) {

		this.energyBill = energyBill;

	}

//This function gets internet bills for the residents
	public int getInternetBill() {

		System.out.println("Your monthly bill is $85");

		return internetBill;

	}

//This function sets internet bill for the residents
	public void setInternetBill(int internetBill) {

		this.internetBill = internetBill;
	}

//This function gets Tv bills for the residents
	public int getTvStreamingBill() {

		System.out.println("Your monthly Tv subscription is $90 ");
		return tvStreamingBill;

	}

//This function sets Tv bill for the residents
	public void setTvStreamingBill(int tvStreamingBill) {

		this.tvStreamingBill = tvStreamingBill;
	}

//This function gets garbage bill for the residents
	public int getGarbageBill() {

		System.out.println("Your montly garbage bill is $60");
		return garbageBill;

	}

//This function sets garbage bill for the residents
	public void setGarbageBill(int garbageBill) {

		this.garbageBill = garbageBill;
	}

//This function displays Ajax Apartments office information
	public void ajaxOfficeInfo() {

		System.out.println("AJAX APARTMENTS OFFICE LOCATION INFO: \n" + "3001 Dunge Street, House 34, Bismarck, ND, USA\n"
				+ "Office number : 701 555 4489 \n" + "Office number : 701 555 0009 - help line and maintenance\n"
				+ "Office email : staff@ajax.com\n" + "For Emergency : 911\n");

	}

//This function displays Apartments details
	public void apartmentDetails() {

		System.out.println("OUR APARTMENTS FACILITIES ARE :\n" + "2 standard bedrooms\n"
				+ "1 sittingroom\n" + "2 kitchens & 2 toilets\n" + "1 balcony \n"
				+ "2 air conditioners & other comfort machines\n");

	}

//This function displays Ajax apartment management team
	public void viewManagementTeam() {

		// Telephone help lines
		System.out.println("WELCOME TO AJAX APARTMENTS !\n" + "No spacing between phone numbers!\n"
				+ "For emergency call 911\n" + "For help call 701-555-0009 our helpline\n");

		// Management team information
		System.out.println("OUR MANAGEMENT TEAM MEMBERS ARE : \n" + "Apartments Manager - Henry Karson \n"
				+ "Office Manager - Kristi Gozz\n" + "Customer Service - Nancy Henderson\n"
				+ "Maintenance Manager - Thomas Cruz\n");

	}

//This function calls Ajax apartments help line and 911
	public void callAjaxPhone() {

		String yourPhoneNumber;

		// Method call for Afax office info
		ajaxOfficeInfo();

		System.out.println(
				"AJAX HELP LINE ! \n" + "Please enter  a phone number\n" + "No spacing between phone numbers!");

		do {

			yourPhoneNumber = scnr.nextLine();

			switch (yourPhoneNumber) {

			case "911":
				System.out.println("Help is here !\n");

				// Method call for incident report function
				residentsIncedentReport();
				System.out.println("We have disparched out 911 team to your location");
				break;

			case "7015550009":
				// Method call for incident report function
				residentsIncedentReport();
				break;

			case "7015554489":
				System.out.println("Prospective new residents, please drop your information here");

				// Method call for new resident registration function
				newResidentRegistration();
				break;

			default:
				System.out.println("Enter exit to quit");
				break;
			}

		} while (!yourPhoneNumber.contains("exit"));
		System.out.println("You have exited this program");
	}

//Function definition for registration of new residents
	public void newResidentRegistration() {

		String residentInfo[] = new String[8];

		System.out.println("Please enter your first name, last name, sex, age,\n"
				+ "marital status(single or married), family size, phone number, move - in date\n");

		System.out.println("View your information below :");
		// For - loop to accept inputs from residents
		for (int i = 0; i <= 7; i++) {
			residentInfo[i] = scnr.next();

		}

		for (String a : residentInfo) {

			System.out.println(a + "  ");
		}
		System.out.println("\nThank you for the submission\n");

	}

//This function shows residents valid access id cards
	public void useAccessIdCard() {

		ArrayList<String> residentIdCard = new ArrayList();
		// Staff accessing the authentic access ID cards given to residents for access
		// into the apartments

		residentIdCard.add("ajax3401");
		residentIdCard.add("ajax3402");
		residentIdCard.add("ajax3403");
		residentIdCard.add("ajax3404");
		residentIdCard.add("ajax3405");
		residentIdCard.add("ajax3406");
		residentIdCard.add("ajax3407");
		residentIdCard.add("ajax3408");
		residentIdCard.add("ajax3409");
		residentIdCard.add("ajax3410");
		residentIdCard.add("ajax3400");

		// General staff access Id ................
		String staffAaccessId = "staffaj719";
		// ........................................

		String userInput;

		for (int i = 0; i < residentIdCard.size(); i++) {

			System.out.println("Enter 1 to enter your apartment\n"
					+ "To view all access codes, insert your 10 digits staff's pass codes \n" + "Enter 3 to exit\n");

			userInput = scnr.next();

			switch (userInput) {

			case "1":
				System.out.println("Insert your 8 digits access Id pass codes");

				userInput = scnr.next();
				if (residentIdCard.contains(userInput)) {
					System.out.println("Access granted\n");
					break;
				}

				else {
					System.out.println("Access denied !\n");
					break;
				}

			case "staffaj719":
				for (String a : residentIdCard)
					System.out.println(a);

				break;
			default:
				System.out.println("Invalid entry !\n");
				break;
			}
			break;
		}

	}

//This function searches for resident by apartment number
	public void findResidents() {

		// Residents and their apartment numbers
		HashMap<Integer, String> residents = new HashMap<Integer, String>();
		// employee.put(883, John.toString());

		residents.put(1, "    Jane    Dune");
		residents.put(2, "    Mark    Kris");
		residents.put(3, "    John    Dewey");
		residents.put(4, "    Richard Bronx");
		residents.put(5, "    Rose    Dune");
		residents.put(6, "    Peter   Pan");
		residents.put(7, "    Mark    Fisher");
		residents.put(8, "    Joe     Tad");
		residents.put(9, "    Monica  Jackson");
		residents.put(10, "   Donald   Moore");
		residents.put(11, "   Jullien  Wimpeg");
		residents.put(12, "   Rose     Miller");
		residents.put(13, "   Ann      Parker");
		residents.put(14, "   Morgan   Craig");
		residents.put(15, "   Chad     Wideel");
		residents.put(16, "   Dick     Pane");
		residents.put(17, "   Mcdee    Fox");
		residents.put(18, "   James    Dicey");
		residents.put(19, "   Henry    Karter");
		residents.put(20, "   Mark     Dude");

		// Method call to show resident menu items
		showResidentsMenu();

		int userInput;
		int aptNumber = 0;
		String residentFullName;

		// Searching for residents using their apartment numbers
		try {
			userInput = scnr.nextInt();

			if (userInput == 1) {
				for (Integer i : residents.keySet()) {
					residents.get(i);
					System.out.println(i + residents.get(i));
				}
				System.out.println();
				System.out.println("Ajax apartment has total of " + residents.size() + " residents");

			}

			else if (userInput == 2) {

				try {
					System.out.println("Enter resident's apartment number\n");
					aptNumber = scnr.nextInt();

					if (aptNumber < residents.size() && aptNumber > 0) {
						System.out.println(residents.get(aptNumber));
					} else {
						System.out.println("Invalid entry! Your entry is out of range");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid entry");
				}

			}
			// Deletes resident in the selected apartment
			else if (userInput == 3) {
				System.out.println("Enter apart number of moved resident ");
				aptNumber = scnr.nextInt();
				residents.remove(aptNumber);
				aptNumber++;
				showResidentsMenu();

			}
			// Adds a new resident
			else if (userInput == 4) {
				String firstName, lastName;

				System.out.println("Add a new resident's apartment number and full name");
				aptNumber = scnr.nextInt();
				firstName = scnr.nextLine();
				lastName = scnr.nextLine();

				residentFullName = firstName + "  " + lastName;
				residents.put(aptNumber, residentFullName);
				showResidentsMenu();

			} else if (userInput == 5) {
				System.out.println("You are exiting the program");

			} else {
				System.out.println("Invalid entry !");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid entry !");
		}

	}

//Function definition for making incedent report
	public void residentsIncedentReport() {

		String[] input = new String[6];
		int i = 0;
		String exit = "y";

		do {
			System.out.println("PLEASE ENTER : \n" + "1 Your full name\n" + "2 Incident's location,\n"
					+ "3 People involved\n" + "4 What happened\n" + "5 Date and  6 time \n");

			for (i = 0; i < 6; i++) {

				// reading array elements from the user
				input[i] = scnr.nextLine();
			}

			System.out.println("Here is the information you entered\n");

			for (String a : input) {

				System.out.println(a);

			}
			System.out.println("Enter y to continue");

			exit = scnr.next();

		} while ((i > 0 && i < 6) && (exit != "y" || exit != "Y"));
		System.out.println("You have exited this program");
	}

//This function perfomrs residents account transactions
	public void accountTransactions() {

		String option;
		double balance = 0;
		double depositAmount = 0;
		double withdrawAmount = 0;

		do {

			// This shows account menu
			showAccountsMenu();

			System.out.println("\nSelect an option ");

			option = scnr.next();

			switch (option) {

			// This shows balance
			case "1":
				System.out.println("Balance is: " + balance + " $");
				break;

			// Pay your bill
			case "2":
				System.out.println("Pay your bill or house rent: ");

				try {
					depositAmount = scnr.nextFloat();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid entry");
					break;
				}
				balance += depositAmount;
				depositAmount++;
				break;

			// Withdraw your money back
			case "3":
				System.out.println("Want your money back? Withdraw amount: ");

				try {
					withdrawAmount = scnr.nextFloat();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Invalid entry");
					break;
				}

				if (withdrawAmount <= balance) {
					balance -= withdrawAmount;
					withdrawAmount++;
					break;
				} else {
					System.out.println("Not enough money");

				}

				break;
			default:
				System.out.println("Invalid entry");
				break;
			}

		} while (!option.equalsIgnoreCase("exit"));
		System.out.println("You have exited this program!\n");

	}

//This function plays even and odd number game in the recreation center
	public void isOddOrEvenNumber() {
		int number;

		System.out.println("Enter a number");
		number = scnr.nextInt();

		if (number <= 0) {
			System.out.println("Invlid number");
		}

		else if (number % 2 == 0) {
			System.out.println("This is even number");

		}

		else {
			System.out.println("This is odd number ");

		}

	}

//Use calculator
	public void useCalculator() {

		int num1;
		int num2;
		String selection = null;

		do {
			System.out.println("Enter two numbers");
			try {
				num1 = scnr.nextInt();
				num2 = scnr.nextInt();

				calculatorMenu();

				selection = scnr.next();

				switch (selection) {

				case "1":
					System.out.println("Anser is :  " + (num1 + num2));
					break;

				case "2":
					System.out.println("Anser is :  " + (num1 - num2));
					break;

				case "3":
					System.out.println("Anser is System.out.println(:  " + (num1 * num2));
					break;

				case "4":
					System.out.println("Anser is :  " + (num1 / num2));
					break;

				case "5":
					System.out.println("Anser is :  " + (Math.pow(num1, num2)));
					break;

				case "6":
					System.out.println(
							" Squar root of num1 = " + Math.sqrt(num1) + " : Squar root of num2 = " + Math.sqrt(num2));
					break;

				default:
					System.out.println("Please select a valid operation ");
					break;

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid entry");
				break;
			}

		} while (!selection.equalsIgnoreCase("exit"));
		System.out.println("You have exited this program!\n");

	}

//Function definition for temperature conversion
	public void tempConversion() {

		float frht;
		float celsius;
		int option;

		do {
			System.out.println();
			System.out.println("Which temperature conversion do you want ?");
			System.out.println("1 to convert to Fahrenheit\n" + "2. to conver to Celsius\n" + "3. to exit\n");

			try {
				option = scnr.nextInt();

				if (option == 1) {
					System.out.println("Enter Celsius temperature");
					celsius = scnr.nextFloat();
					frht = (celsius * 9 / 5) + 32;
					System.out.println("Fahrenheit temperature is : " + frht);
				} else if (option == 2) {
					System.out.println("Enter Fahrenheit temperature");
					frht = scnr.nextFloat();
					celsius = (frht - 32) * 5 / 9;
					System.out.println("Celsius temperature is : " + celsius);
				}

				else if (option == 3) {
					System.out.println("You exited the program");
					break;
				}

				else {
					System.out.println("Wrong input ...");

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid entry");
				break;
			}
		} while (option != 3);
		System.out.println("You have exited this program!\n");

	}

//Function definition for viewing Ajax system menu
	public void showSystemenu() {
		System.out.println("*************************************************");
		System.out.println("* MENU OPTIONS FOR AJAX APARTMENTS INC.\n" + "* CLIENTS APP MANAGER\n");
		System.out.println("* 1.  See office information\n" + "* 2.  See apartments details at Ajax Apartments\n"
				+ "* 3.  See management team\n" + "* 4.  Call help line\n" + "* 5.  New resident registration\n"
				+ "* 6.  Enter apartment with your entrance ID Card \n" + "* 7.  Find residents \n"
				+ "* 8.  Make incedent report\n" + "* 9.  Accounts information & transactions\n"
				+ "* 10. Use calculator\n" + "* 11. Temperature conversion\n" + "* 12. Even and odd number game\n"
				+ "* 13. Buy Coke or water from vending machine\n" + "* 14. Check electricity bill\n"
				+ "* 15. Check your Internet bill\n" + "* 16. Check your tv subscription bill\n"
				+ "* 17. Check your garbage bill\n" + "* 18. Check house rent\n" + "* 19. View residents Access ID \n"
				+ "* 20. Exit program");
		System.out.println("*************************************************");
	}

//Function definition for viewing Ajax office menu
	public void showOfficeMenu() {
		System.out.println("1.  See office information\n" + "2.  See apartments details at Ajax Apartments\n"
				+ "3.  See management team\n" + "4.  Call help line\n" + "5.  New resident registration\n"
				+ "6.  Enter apartment with your entrance ID Card" + "7.  Find residents\n"
				+ "8.  Make incedent report\n" + "9.  Accounts information & transactions\n" + "10. Use calculator\n");

	}

//Function definition for viewing residents menu
	public void showResidentsMenu() {

		System.out.println("1. to see all residents\n" + "2. to find a resident\n" + "3. to delete a resident\n"
				+ "4. to add new resident\n" + "5. Exit\n");

	}

//Function definition for viewing accounts menu
	public void showAccountsMenu() {

		System.out.println("1. Check balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4 Type exit to quit");

	}

//Function definition for viewing calculator menu
	public void calculatorMenu() {

		System.out.println("Select operation\n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n"
				+ "4. Division \n" + "5. Exponent \n" + "6. Squaroot \n" + "7. Type exit to quit to main menu ");
	}

//Function definition for purchasing items from vending machine 
	public void purchaseStoreItem() {

		System.out.println(
				"Enter 1. for Diet Coke\n" + "2. for Regular  Code\n" + "3. for Bottled Water\n" + "0. to exit");

		int pick;
		try {
			pick = scnr.nextInt();

			int itemQuantity = 0;
			float payment = 0;
			float balance = 0;

			do {

				if (pick == 1 || pick == 2) {
					System.out.println("How many cokes do you want ? $2 each ");
					itemQuantity = scnr.nextInt();

					System.out.println("Total price = $ " + itemQuantity * 2);
					System.out.println("Please enter payment amount");
					payment = scnr.nextFloat();

					if (payment < itemQuantity * 2) {
						System.out.println("Please complete your payment");
						break;
					} else if (payment > itemQuantity) {

						balance = payment - itemQuantity * 2;
						System.out.println("Here is your balance : $" + balance + " Thank you!");
						break;
					}

					else {
						System.out.println("Payment received! Thank you!");
						break;
					}
				}

				else if (pick == 3) {
					System.out.println("How many bottled water do you want ? $2.50 each");

					itemQuantity = scnr.nextInt();

					System.out.println("Total price = $ " + itemQuantity * 2.5);

					System.out.println("Please enter payment amount");
					payment = scnr.nextFloat();

					if (payment < itemQuantity * 2.5) {
						System.out.println("Please complete your payment");
					}

					else if (payment > itemQuantity) {

						balance = (float) (payment - itemQuantity * 2.5);
						System.out.println("Here is your balance : $" + balance + " Thank you!");
						break;
					} else {
						System.out.println("Payment received! Thank you!");
						break;
					}
				}

				else {
					System.out.println("Invalid entry");
					break;

				}

			} while (pick != 0);
			System.out.println("You have exited this program !\n");
			System.exit(pick);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid entry");
		}

	}

//Function definition for the main Ajax management system application
	public void AjaxManagementSystem() {

		int option;

		do {

			System.out.println("\nPlease choose an option\n");
			showSystemenu();

			try {
				option = scnr.nextInt();

				switch (option) {
				case 1:
						ajaxOfficeInfo();
						break;

				case 2:
						apartmentDetails();
						break;

				case 3:
						viewManagementTeam();
						break;

				case 4:
						System.out.println("Please enter a phone number");
						callAjaxPhone();
						break;

				case 5:	
						newResidentRegistration();
						break;

				case 6:
						useAccessIdCard();
						break;

				case 7:
						findResidents();
						break;

				case 8:	
						residentsIncedentReport();
						break;

				case 9: 
						accountTransactions();
						break;

				case 10:
						useCalculator();
						break;

				case 11:
						tempConversion();
						break;

				case 12:
						isOddOrEvenNumber();
						break;

				case 13:
						purchaseStoreItem();
						break;

				case 14:
						getEnergyBill();
						break;

				case 15:
						getInternetBill();
						break;

				case 16:
						getTvStreamingBill();
						break;

				case 17:
						getGarbageBill();
						break;

				case 18:
						getHouseRent();
						break;

				case 19:
						useAccessIdCard();
						break;

				default:
						System.out.println("Invalid entry ");
						break;

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
					System.out.println("Invalid entry");
					break;
			}

		} while (option >= 1 && option <= 19);

		System.out.println("You have exited this program!\n");

	}
}
