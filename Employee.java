package ajax;

import java.util.*;

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

}
