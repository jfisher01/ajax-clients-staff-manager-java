package ajax;

import java.util.HashMap;

/**
 * 
 * Provides interface for Employee class. 
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/24/2023
 * @since Ajax Clients Employees Manager 1.0
 *
 */
public interface Employees 
{
		
		public String getName(); 
	

		public void setName(String name); 
	

		public int getIdNumber();

		public void setIdNumber(int idNumber); 

		public String getDepartment(); 

		public void setDepartment(String department); 

		public String getPosition(); 

		public void setPosition(String position); 
		
		public HashMap<Integer, String> getEmployee();
		
		public void setEmployee(HashMap<Integer, String> employee);
		
		public boolean containsValue(Object value);
		
		public  void getHourlyPayRate(); 
		
		public void getNumbOfHoursWorked(); 
		
		public void employeeManager();
		
		public String toString();
		
	
		



	


}
