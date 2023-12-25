package ajax;

import java.util.Scanner;

/**
 * ClientInterface class manages this application's user-interface
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/24/2023
 * @since Ajax Clients Employees Manager 1.0
 */

public class ClientInterface
{
	//Classes and objects interacting in this ClientInterface class
	ClientsAccount client = new ClientsAccount();
	ClientsRecords record = new ClientsRecords();
	Employee employee = new Employee();
	PublicServices service = new PublicServices();	
	StaffSchedules schedule = new StaffSchedules();	
	MenuOptions menu = new MenuOptions();	
	Scanner keyboardInput = new Scanner(System.in);
	 
	/**
	 * systemManager method manages and control user's interface interaction. 
	 * Void method systemManager
	 */
	public void ajaxclientsEmployeesManager() 
	{
		int option = 0;

		do {

			System.out.println("\nPlease choose an option\n");
			menu.showSystemenu();

			try {
				option = keyboardInput.nextInt();

				switch (option) 
				{
				case 1:
						System.out.println("Welcome to clients records services!");
						record.clientsRecordsManager();
						break;

				case 2:
						System.out.println("Welcome to clients bills and rent services!");
						client.payBill();
						break;

				case 3:
						System.out.println("Get your gate pass ready!");
						client.useAccessIdCard();
						break;

				case 4:
						System.out.println("Welcome to employee services!");
						employee.employeeManager();
						break;

				case 5:	
						System.out.println("Welcome to employees schedules services!");
						schedule.viewStaffSchedule();
						break;

				case 6:
						System.out.println("Trying to reach us through phone call?");
						service.callAjaxPhone();
						break;

				case 7:
					   System.out.println("Welcome to Even or Odd Number Game!");
					    service. playEvenOddNumberGame();
						break;

				case 8:	
						System.out.println("Welcome to calculator services!");
						service.useCalculator();
						break;

				case 9: 
						System.out.println("Welcome to temperature conversion services!");
						service.tempConverter();
						break;

				case 10:
						System.out.println("Welcome to vending machine services!");
						service.getSoftDrink();
						break;

				default:
						System.out.println("Invalid entry ");
						break;

				}
				} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
					System.out.println("Invalid entry");
					System.exit(0);
			}

		} while (option >= 0 && option < 11);

		System.out.println("You have exited ajax system manager!\n");

	}
 
}


