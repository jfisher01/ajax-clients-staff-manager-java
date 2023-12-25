package ajax;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


/**
 * Employee class controls and manages employees operations and information. 
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/24/2023
 * @since Ajax Clients Employees Manager 1.0
 *
 */
public class Employee implements Employees
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	private Employee anyEmployee;
	
	protected HashMap<Integer, String> employee = new HashMap<Integer, String>();

	 Scanner keyboardInput = new Scanner(System.in);

	/**
	 * Non-parametric constructor for employees in AJAX APARTMENTS INC.
	 */
	 
	public Employee() 
	{
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}

	/**
	 * Parametric constructor for employees in AJAX APARTMENTS INC.
	 * @param name
	 * @param idNumber
	 * @param department
	 * @param position
	 */
	public Employee(String name, int idNumber, String department, String position) 
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;

	}
	
	
	/**
	 * Gets employee's name
	 * @return the name from getName method
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * Sets employee's name
	 * @param name the name parameter in the setName method
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * Gets employee's Id
	 * @return the idNumber from getIdNumber method
	 */
	public int getIdNumber() 
	{
		return idNumber;
	}

	/**
	 * Sets the employee's Id 
	 * @param idNumber the idNumber parameter in the setIdNumber method
	 */
	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}

	/**
	 * Gets the employee's department
	 * @return the department from the getDepartment method
	 */
	public String getDepartment() 
	{
		return department;
	}

	/**
	 * Sets the employee's department
	 * @param department the department parameter in the setDepartment method
	 */
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	/**
	 * Gets the employee's position
	 * @return the position from the getPosition method
	 */
	public String getPosition() 
	{
		return position;
	}

	/**
	 * Sets the employee's position
	 * @param position the position parameter in the setPosition method
	 */
	public void setPosition(String position) 
	{
		this.position = position;
	}


	/**
	 * Gets anyEmpolyee class object
	 * @return the anyEmployee class object from getAnyEmployee method
	 */
	public Employee getAnyEmployee() 
	{
		return anyEmployee;
	}

	/**
	 * Sets anyEmployee class object
	 * @param anyEmployee the anyEmployee parameter from the setAnyEmployee method
	 */
	public void setAnyEmployee(Employee anyEmployee) 
	{
		this.anyEmployee = anyEmployee;
	}

	/**
	 * Gets the employee's detailed information 
	 * @return the employee from the getEmployee method
	 */
	public HashMap<Integer, String> getEmployee() 
	{
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
				
				
				//Identify staff by last 3 digits of SSN
				
				employee.put(883,John.toString());
				employee.put(555,Kelly.toString());
				employee.put(567,Kelvin.toString());
				employee.put(457,Frank.toString());
				employee.put(135,Grace.toString());
				employee.put(980,Hilda.toString());
				employee.put(905,Alice.toString());
				employee.put(736,Chris.toString());
				employee.put(102,Chad.toString());
				employee.put(114,Ryan.toString());
				employee.put(774,Alicia.toString());
				employee.put(806,Emy.toString());
				employee.put(922,Eric.toString());
				employee.put(611,Jake.toString());
				employee.put(541,Kazman.toString());
				employee.put(117,Judy.toString());

		return employee;
	}

	/**
	 * Sets employee detailed information
	 * @param employee the employee parameter in the setEmployee method
	 */
	public void setEmployee(HashMap<Integer, String> employee) 
	{
		this.employee = employee;
	}
	
	/**
	 * Checks if there is an employee.
	 * @param value
	 * @return true is there is an employee
	 * @see java.util.HashMap#containsValue(java.lang.Object)
	 */
	public boolean containsValue(Object value) 
	{
		return employee.containsValue(value);
	}

	/**
	 * Sets key for employee. 
	 * @return the keySet for employee
	 * @see java.util.HashMap#keySet()
	 */
	public Set<Integer> keySet() 
	{
		return employee.keySet();
	}

	/**
	 * Void getHourlyPayRate method. 
	 * 
	 * Gets hourly pay rate for employees
	 */
	public  void getHourlyPayRate() 
	{
		
		double hourlyPayRate = 0;
		int staffPay = 1;

		do {
			System.out.println("Enter 1 for HR Manager:\n" + "2 for Maintenance Manager:\n" + "3 for HR staff:\n"
					+ "4 for Maintenance:\n" + "5 for other staff:\n" + "Enter 0 to exit:\n");

			staffPay = keyboardInput.nextInt();

			if (staffPay == 1) 
			{
				hourlyPayRate = 24;

				System.out.printf("HR Manager pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 2) 
			{
				hourlyPayRate = 26;

				System.out.printf("Maintenance Manager pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 3) 
			{
				hourlyPayRate = 19;

				System.out.printf("HR Staff  pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 4) 
			{
				hourlyPayRate = 21;

				System.out.printf("Maintenance Technicians pay is $%.2f per hour%n",hourlyPayRate);
			}

			else if (staffPay == 5) 
			{
				hourlyPayRate = 18;

				System.out.printf("Other staff pay is $%.2f per hour%n",hourlyPayRate);
			}

			else 
			{
				System.out.println("Invalid entry");
				
			}

		} while (staffPay != 0);

		System.out.println("You exited getHourlyPayRate()!\n");
	}

	
	/**
	 * Void getNumberOfHoursWorked method. 
	 * 
	 * Gets number of hours worked  by employees
	 */ 
	public void getNumbOfHoursWorked() 
	{
		double daysWorked;

		System.out.println("Please enter number of days you worked?:\n");

		daysWorked = keyboardInput.nextDouble();

		double numbOfHoursWorked = daysWorked * 8;

		System.out.println("Number of hours worked is :" + numbOfHoursWorked + " hours\n");
	}
	
	/**
	 * Void employeeManager method. 
	 * Manages staff work-related information
	 */
	public void employeeManager()
	{
	int ssn = 0;

	int choice = 0;
	
	MenuOptions menus = new MenuOptions();

	do {	
				menus.showStaffMenu();

				System.out.println("Enter a number: ");
				try {
				choice = keyboardInput.nextInt();

				switch (choice) 
				{
				case 1:
					// Gets all staff information
					
					System.out.println(getEmployee());
					break;

				case 2:
						// Gets a staff information
						try 
						{
			     		System.out.println("Enter last 3 SSN:");

						ssn = keyboardInput.nextInt();

						if (getEmployee().containsKey(ssn)) 	
						{
							System.out.println(ssn + " is the " + getEmployee().get(ssn));
							
							}
					else 
						{
							System.out.println("Invalid entry!\n");						
							break;
							}
						}
						catch (Exception e) 
							{
							// TODO Auto-generated catch block

							System.out.println("Invalid entry!\n");
							System.exit(0);
							}
						System.out.println("Staff information obtained successfully!\n");
							break;

					case 3:
							// Gets staff hourly per rate
							getHourlyPayRate();
							break;

				   case 4:
					   		// Gets staff number of hours worked
					   		getNumbOfHoursWorked();
					   		break;

				   default:
					   		System.out.println("Invalid entry or data type mismatch!");
					   		break;
							}

							} 
					catch (Exception e) 
							{
							// TODO Auto-generated catch block

							System.out.println("Invalid entry or data type mismatch!");
							System.exit(0);
							}						
		
			} 	while (choice > 0 && choice < 5);

			System.out.println("You have exited the whole program!");
	
	}
	
	/**
	 * toString method for Employee class. 
	 * 
	 * @return toString method's values
	 */
	public String toString()
	{
		
		return (" SSN" + "\nEmployee: Name: " + name + "\nID Number: " +  idNumber + "\nDepartment: " + department + "\nPosition : " + position + "\n\n");
	}

}
