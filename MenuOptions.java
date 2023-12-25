package ajax;

/**
 * MenuOption class implements MenuInterface.    
 * Contains different show-menus for this application.  
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/24/2023
 * @since Ajax Clients Employees Manager 1.0
 *
 */
public class MenuOptions implements MenuInterface
{

	/**
	 * Shows the main menu for this application 
	 */
	public void showSystemenu() 
	{
		
		System.out.println("*************************************************");
		System.out.println("*  MENU OPTIONS FOR AJAX APARTMENTS INC.  *\n" + "*         SYSTEM'S APP MANAGER             *\n");
		System.out.println("* 1.  CLIENTS RECORDS SERVICES\n" + "* 2.  BILLS AND RENT SERVICES\n"
				+ "* 3.  ENTER APARTMENT BLOCK\n" + "* 4.  EMPLOYEE SERVICES\n" + "* 5.  EMPLOYEES SCHEDULES\n"
				+ "* 6.  CALL AJAX OFFICE \n" + "* 7.  PLAY NUMBER GAME\n"
				+ "* 8.  USE CALCULATOR\n" + "* 9.  TEMPERATURE CONVERTER\n"
				+ "* 10. GET SOFT DRINK\n" + "* 11. EXIT THIS PROGRAM");
		System.out.println("*************************************************");
		
		
	}
	
	/**
	 * Shows the menu for office information.
	 */
	public void showOfficeInfo() 
	{
		System.out.println("AJAX APARTMENTS OFFICE LOCATION INFO: \n" + "3001 Dunge Street, House 34, Bismarck, ND, USA\n"
				+ "Office number : 701 555 4489 \n" + "Office number : 701 555 0009 - help line and maintenance\n"
				+ "Office email : staff@ajax.com\n" + "For Emergency : 911\n");

	}

	/**
	 * Shows the menu for viewing management team.
	 */
	public void viewManagementTeam() 
	{
		// Telephone help lines
		System.out.println("WELCOME TO AJAX APARTMENTS !\n" + "No spacing between phone numbers!\n"
				+ "For emergency call 911\n" + "For help call 701-555-0009 our helpline\n");

		// Management team information
		System.out.println("SOME OF OUR MANAGEMENT TEAM MEMBERS ARE : \n" + "Marketing Manager - Emy Hintz \n"
				+ "Human Resources Manager - Frank Kleen\n" + "Customer Service - Chris Bell\n"
				+ "Maintenance Manager - Eric Madilan\n");
	}
	
	/**
	 * Shows the menu for employees related work information
	 * 
	 */
	public void showStaffMenu() 
	{
		System.out.println("*********************************");
		System.out.println("*     EMPLOYEES APP MANAGER     *");
		System.out.println("* Enter : \n" + "* 1 to get all staff information:\n" + "* 2. to get a staff information:\n"
				+ "* 3 to see hourly per rate:\n" + "* 4 to see number of hours worked:\n" + "* 5 to exit the program:");
		System.out.println("**********************************\n");
	}


	/**
	 * Displays Apartments details
	 */
	public void apartmentDetails() 
	{
		System.out.println("OUR APARTMENTS FACILITIES ARE :\n" + "2 standard bedrooms\n"
				+ "1 sittingroom\n" + "2 kitchens & 2 toilets\n" + "1 balcony \n"
				+ "2 air conditioners & other comfort machines\n");

	}

	/**
	 * Shows residents memnu
	 */
	public void showResidentsMenu() 
	{
		System.out.println("1. to see all residents\n" + "2. to find a resident\n" + "3. to delete a resident\n"
				+ "4. to add new resident\n" + "5. Exit\n");

	}

	
	/**
	 * Shows the menu for  viewing clients accounts information
	 */
	public void showAccountsMenu() 
	{

		System.out.println("1. Check balance\n" + "2. Deposit\n" + "3. Withdraw\n" + "4 Type exit to quit");

	}

	
	/*
	 * Shows calculator meny information
	 */
	public  void calculatorMenu() 
	{

		System.out.println("Select operation\n" + "1. Addition \n" + "2. Subtraction \n" + "3. Multiplication \n"
				+ "4. Division \n" + "5. Exponent \n" + "6. Squaroot \n" + "7. Type exit to quit to main menu ");
	}



	/**
	 * Shows residents' records menu
	 */
	public void showRecordsMenu() 
	{
		String residentsRecordMenu = "*************************************\n" +
		 "ENTER 1 TO VIEW ALL RESIDENTS RECORDS: \n" +  "ENTER 2 TO VIEW A RESIDENT'S RECORDS: \n" + "ENTER 3 TO MOVE OR DELETE A RESIDENT RECORDS: \n"
		+ "ENTER 4 TO ADD NEW RESIDENT: \n" + "ENTER 5 OR GREATER NUMBER TO EXIT\n" +  "**************************************\n" ;
		
		System.out.println(residentsRecordMenu);
	}




}
