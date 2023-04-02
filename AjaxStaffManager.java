/**
 * 
 */
package ajax;

import java.util.*;

/**
 * @author uchejf
 *
 */
public class AjaxStaffManager {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AjaxResidentsManager residentsManager = new AjaxResidentsManager();
		//Employee employeeManager = new Employee();
		

		// Employees information database objects
		// Staff First Name - Full lName - ID Number Dept. - Position
		Employee John = new Employee("John Wayne", 102000, "IT ", "Administrator");
		Employee Kelly = new Employee("Kelly Bosch", 102001, "IT ", "Webmaster");
		Employee Kelvin = new Employee("Kelvin Moore ", 102002, "IT ", "PC Technician");
		Employee Frank = new Employee("Frank Kleen ", 102003, "HR ", "Manager");
		Employee Grace = new Employee("Grace Jones ", 102004, "HR ", "Co-ordinator");
		Employee Hilda = new Employee("Hilda Russel ", 102005, "HR ", "Co-ordinator");
		Employee Alice = new Employee("Alice Fox ", 102006, "HR ", "Payroll");
		Employee Chris = new Employee("Chris Bell ", 102007, "Front Desk ", "Receptionis");
		Employee Chad = new Employee("Chad Lee ", 102008, "Leasing ", "Leasing Specialist");
		Employee Ryan = new Employee("Ryan Dove ", 102009, "Leasing ", "Leasing Specialist");
		Employee Alicia = new Employee("Alicia Doon ", 102010, "Marketing ", "Marketing Officer");
		Employee Emy = new Employee("Emy Hintz ", 102011, "Marketing ", "Marketing Officer");
		Employee Eric = new Employee("Eric Madilan ", 102012, "Maintenance ", "Maintenance Manager");
		Employee Jake = new Employee("Jake Banden ", 102013, "Maintenance ", "Maintenance Tech.");
		Employee Kazman = new Employee("Kazman Kizon ", 102014, "Maintenance ", "Maintenance Tech.");
		Employee Judy = new Employee("Judy Braswic ", 102015, "HR ", "Intern");

		// HashMap Datastructure that links employees to database objects
		// Identify staff by last 3 digits of SSN
		HashMap<Integer, String> employee = new HashMap<Integer, String>();
		employee.put(883, John.toString());
		employee.put(555, Kelly.toString());
		employee.put(567, Kelvin.toString());
		employee.put(457, Frank.toString());
		employee.put(135, Grace.toString());
		employee.put(980, Hilda.toString());
		employee.put(905, Alice.toString());
		employee.put(736, Chris.toString());
		employee.put(102, Chad.toString());
		employee.put(114, Ryan.toString());
		employee.put(774, Alicia.toString());
		employee.put(806, Emy.toString());
		employee.put(922, Eric.toString());
		employee.put(611, Jake.toString());
		employee.put(541, Kazman.toString());
		employee.put(117, Judy.toString());

		//Input Scanner object
		Scanner scnr = new Scanner(System.in);
		
		

		// Accessing employees database objects
		int ssn = 0;

		int choice = 0;

		int appManager = 0;

		do {
			
			System.out.println("AJAX APARTMENT APP MANAGER");
			System.out.println("**************************");
			System.out.println("TO MANAGE CLIENTS: ENTER 1\n" +  "TO MANAGE EMPLOYEES: \n" + "ENTER ANY NUMBER EXCEPT 1\n");
			System.out.println("**************************");
			//Try and handles exception
			try {
				appManager = scnr.nextInt();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Invalid entry");
			}

			if (appManager == 1) {
				
				//Clients app manager
				residentsManager.AjaxManagementSystem();
				
			}
			
			else
				
				//Employees app manager
					
				//Exception handler
				try {

					Employee.showMenu();

					// Handles exception
					System.out.println("Enter a number");

					choice = scnr.nextInt();

					switch (choice) {

					case 1:
						// Gets all staff information
						for (Integer i : employee.keySet())

							System.out.println("Last 3 SSN: " + i + " \n" + employee.get(i));
						break;

					case 2:
						// Gets a staff information
						// Handles exception
						try {
							int i = 0;

							System.out.println("Enter last 3 SSN");

							ssn = scnr.nextInt();

							while (i <= 15) {
								if (employee.containsKey(ssn)) {
									i = ssn;

									System.out.println("Last 3 SSN: " + i + " \n" + employee.get(ssn) + "\n");
									i++;
									System.out.println("Program ended !");
									break;
								}
								System.out.println("Invalid entry");
								i++;
								break;
							}

						} catch (Exception e) {
							// TODO Auto-generated catch block

							System.out.println("Invalid entry");
						}
						System.exit(choice);

					case 3:
						// Gets staff hourly per rate
						Employee.getHourlyPayRate();
						choice++;
						System.out.println("Program ended !");
						break;

					case 4:
						// Gets staff number of hours worked
						Employee.getNumbOfHoursWorked();
						choice++;
						break;

					default:
						System.out.println("Invalid entry");
						choice++;
						break;
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block

					System.out.println("Invalid entry");
				}

		} while (choice > 0 && choice <= 4);

		System.out.println("You have exited the program");

	}

}
