package ajax;

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author uchej
 *
 */
public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;

	static Scanner scnr = new Scanner(System.in);

	// Default constructor for this program
	public Employee() {

	}

	// Parametric constructor for this program
	public Employee(String name, int idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	// Gets hourly pay rate
	public static void getHourlyPayRate() {

		double hourlyPayRate = 0;
		int staffPay = 1;

		do {
			System.out.println("Enter 1 for HR Manager\n" + "2 for Maintenance Manager\n" + "3 for HR staff\n"
					+ "4 for Maintenance\n" + "5 for other staff\n" + "Enter 0 to exit\n");

			staffPay = scnr.nextInt();

			if (staffPay == 1) {
				hourlyPayRate = 24;

				System.out.println("HR Manager pay is $" + hourlyPayRate + " per hour");
			}

			else if (staffPay == 2) {
				hourlyPayRate = 26;

				System.out.println("Maintenance Manager pay is $" + hourlyPayRate + " per hour");
			}

			else if (staffPay == 3) {
				hourlyPayRate = 19;

				System.out.println("HR Staff  pay is $" + hourlyPayRate + " per hour");
			}

			else if (staffPay == 4) {
				hourlyPayRate = 21;

				System.out.println("Maintenance Technicians pay is $" + hourlyPayRate + " per hour");
			}

			else if (staffPay == 5) {
				hourlyPayRate = 18;

				System.out.println("Other staff pay is $" + hourlyPayRate + " per hour");
			}

			else {
				System.out.println("Invalid entry");
			}

		} while (staffPay != 0);

		System.out.println("You are exiting the program\n");

	}

	// Gets number of hours worked
	public static void getNumbOfHoursWorked() {
		double daysWorked;

		System.out.println("Please enter number of days you worked?\n");

		daysWorked = scnr.nextDouble();

		double numbOfHoursWorked = daysWorked * 8;

		System.out.println("Number of hours worked is :" + numbOfHoursWorked + " hours\n");
	}

	// Shows program's menu
	public static void showMenu() {
		System.out.println("*********************************");
		System.out.println("*     EMPLOYEES APP MANAGER     *");
		System.out.println("* Enter : \n" + "* 1 to get all staff information\n" + "* 2. to get a staff information\n"
				+ "* 3 to see hourly per rate\n" + "* 4 to see number of hours worked\n" + "* 5 to exit the program");
		System.out.println("**********************************\n");
	}

	// Tostring method to show staff informaion
	public String toString() {
		return ("Name:  " + name + "\nID No: " + idNumber + "\nDept:  " + department + "\nPosition: " + position
				+ "\n");
	}
	
	//Ajax App Manager
	public static void clients_staff_manager() {
		
	AjaxResidentsManager residentsManager = new AjaxResidentsManager();

	// Employees information database objects
	// Staff First Name -          Full lName - ID Number Dept. - Position
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
			break;
		}

		if (appManager == 1) {
			
			//Clients app manager
			residentsManager.ajax_client_manager();
			
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
