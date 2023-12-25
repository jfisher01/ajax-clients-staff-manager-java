package ajax;
import java.util.*;

/**
 * ClientRecords class controls clients records and information. 
 * 
 * @author Johnfisher Uchem
 * @version 1.0 / 12/24/2023
 * @since Ajax Clients Employees Manager 1.0 
 *
 */

public class ClientsRecords 
{
	private String fullName ;
	private int aptNumber ;
	private String moveInDate ;
	private String leaseEndDate ;
	private int familySize ;
	private String petType ;
	private int carParkNumber ;
	private ClientsRecords anyClient;
	
	protected ArrayList<ClientsRecords> clients = new ArrayList<>();
	
	
	
	 Scanner keyboardInput = new Scanner(System.in) ;
	 
	/**
	 * Non-parametric constructor for ClientRecords class.
	 */
	public ClientsRecords()
	{
		 fullName = "";
		aptNumber = 0;
		moveInDate = "";
		leaseEndDate = "";
		familySize = 0;
		petType = "";
		carParkNumber = 0;
		
	}
		
	/**
	 * Parametric constructor for ClientRecords class.
	 * @param fullName
	 * @param aptNumber
	 * @param moveInDate
	 * @param leaseEndDate
	 * @param familySize
	 * @param petType
	 * @param carParkNumber
	 */
	public ClientsRecords(String fullName, int aptNumber,String moveInDate,String leaseEndDate,int familySize,String petType,int carParkNumber)
	{
		
		this.fullName = fullName;
		this.aptNumber = aptNumber;
		this.moveInDate = moveInDate;
		this.leaseEndDate = leaseEndDate;
		this.familySize = familySize;
		this.petType = petType;
		this.carParkNumber = carParkNumber;
		
	}
	
	
	/**
	 * Gets the fullName of resident clients. 
	 * @return the fullName from the getFullName method
	 */
	public String getFullName() 
	{
		return fullName;
	}

	/**
	 * Sets resident clients fullName.  
	 * @param fullName the fullName parameter in the setFullName method
	 */
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}

	/**
	 * Gets resident clients aptNumber. 
	 * @return the aptNumber from getAptNumber method
	 */
	public int getAptNumber() 
	{
		return aptNumber;
	}

	/**
	 * Sets client residents aptNumber. 
	 * @param aptNumber the aptNumber parameter in the aptNumber method
	 */
	public void setAptNumber(int aptNumber) 
	{
		this.aptNumber = aptNumber;
	}

	/**
	 * Gets resident clients moveInDate.  
	 * @return the moveInDate from getMoveInDate method
	 */
	public String getMoveInDate() 
	{
		return moveInDate;
	}

	/**
	 * Sets resident clients moveInDate. 
	 * @param moveInDate the moveInDate parameter in the setMoveInDate method
	 */
	public void setMoveInDate(String moveInDate) 
	{
		this.moveInDate = moveInDate;
	}

	/**
	 * Gets resident clients leaseEndDate. 
	 * @return the leaseEndDate from getLeaseEndDate method
	 */
	public String getLeaseEndDate() 
	{
		return leaseEndDate;
	}

	/**
	 * Sets resident clients leaseEndDate. 
	 * @param leaseEndDate the leaseEndDate in the setLeaseEndDate method
	 */
	public void setLeaseEndDate(String leaseEndDate) 
	{
		this.leaseEndDate = leaseEndDate;
	}

	/**
	 * Gets resident clients familySize.  
	 * @return the familySize from getFamilySize method
	 */
	public int getFamilySize() 
	{
		return familySize;
	}

	/**
	 * Sets resident clients familySize. 
	 * @param familySize the familySize parameter in the setFamilySize method
	 */
	public void setFamilySize(int familySize) 
	{
		this.familySize = familySize;
	}

	/**
	 * Gets resident clients petType. 
	 * @return the petType from getPetType method
	 */
	public String getPetType() 
	{
		return petType;
	}

	/**
	 * Sets resident clients petType.  
	 * @param petType the petType parameter in the setPetType method
	 */
	public void setPetType(String petType) 
	{
		this.petType = petType;
	}

	/**
	 * Gets resident clients carParkNumber. 
	 * @return the carParkNumber from getCarParkNumber method
	 */
	public int getCarParkNumber()
	{
		return carParkNumber;
	}

	/**
	 * Sets the carParkNumber. 
	 * @param carParkNumber the carParkNumber parameter in the setCarParkNumber
	 */
	public void setCarParkNumber(int carParkNumber) 
	{
		this.carParkNumber = carParkNumber;
	}

	/**
	 * Gets clients records from getClients method. 
	 * @return the clients from getClients method
	 */
	public ArrayList<ClientsRecords> getClients() 
	{
		// Residents records database objects
		// Residents  First Name -               Full lName -    Apt#- Moved-in Date- Lease End Date- Family Size- Pet Type Parking Lot number
		ClientsRecords jane = new ClientsRecords("Jane  Dune",   0,     "01/01/2014", "01/01/2026",     1,		 "one dog", 100);
		ClientsRecords mark = new ClientsRecords("Mark Kris",   1,      "01/07/2014 ","01/07/2026",     3	,	 "one dog", 101);
		ClientsRecords john =    new ClientsRecords("John   Dewey",  2, "01/11/2014 ","01/11/2026 ",    5,		 "none",    102);
		ClientsRecords richard = new ClientsRecords("Richard Bronx", 3, "12/01/2015 ","12/01/2026",     2,		 "none",    103);
		ClientsRecords roseline = new ClientsRecords("Roseline Dune",4, "01/01/2016 ","01/01/2026",     2,		 "none",    104);
		ClientsRecords peter =   new ClientsRecords("Peter  Pan ",   5, "04/01/2016 ","04/01/2026",     3,		 "none",    105);
		ClientsRecords brian =   new ClientsRecords("Brian   Fisher", 6,"06/01/2016 ","06/01/2026",    3,		 "one cat", 106);
		ClientsRecords joe =     new ClientsRecords("Joe    Tad ",   7, "08/01/2017 ","08/01/2026",     1,		 "one dog", 107);
		ClientsRecords monica = new ClientsRecords("Monica Jackson", 8, "10/01/2017 ","10/01/2026",     5,		 "none",    108);
		ClientsRecords donald =  new ClientsRecords("Donald Moore",  9,"01/01/2018 ","01/01/2026",     4,		 "none",    109);
		ClientsRecords jullien = new ClientsRecords("Jullien Wimpeg",10,"02/01/2018 ","02/01/2026",     2,		 "none",    110);
		ClientsRecords rose =    new ClientsRecords("Rose   Miller", 11,"03/01/2019 ","03/01/2026",     5,		 "one dog", 111);
		ClientsRecords ann =     new ClientsRecords("Ann    Parker", 12,"04/01/2019 ","04/01/2026",     3,		 "one dog", 112);
		ClientsRecords morgan =  new ClientsRecords("Morgan Craig",  13,"09/01/2019 ","09/01/2026",     2,		 "none",    113);
		ClientsRecords chad =    new ClientsRecords("Chad   Wideel", 14,"01/01/2020"," 01/01/2026",     3,		 "none",    114);
		ClientsRecords dick =    new ClientsRecords("Dick   Pane",   15,"07/01/2020 ","07/01/2026",     4,		 "none",    115);
		ClientsRecords mcdee =   new ClientsRecords("Mcdee  Fox",    16,"01/01/2021 ","01/01/2026",     4,		 "none",    116);
		ClientsRecords james =   new ClientsRecords("James  Dicey",  17,"05/01/2022 ","05/01/2026",     2,		 "none",    117);
		ClientsRecords henry  =  new ClientsRecords("Henry  Karter", 18,"01/01/2023 ","01/01/2026",     4,		 "none",    118);
		ClientsRecords mike  =   new ClientsRecords("Mike   Dude",   19,"08/01/2023 ","08/01/2026",     1,		 "one cat", 119);
		

		
		clients.add(jane);
		clients.add(mark);
		clients.add(john);
		clients.add(richard);
		clients.add(roseline);
		clients.add(peter);
		clients.add(brian);
		clients.add(joe);
		clients.add(monica);
		clients.add(donald);
		clients.add(jullien);
		clients.add(rose);
		clients.add(ann);
		clients.add(morgan);
		clients.add(chad);
		clients.add(dick);
		clients.add(mcdee);
		clients.add(james);
		clients.add(henry);
		clients.add(mike);
	
		return clients;
	}
	
	/**
	 * Sets clients in the setClients method. 
	 * @param clients the clients parameter in the setClient method
	 */
	public void setClients(ArrayList<ClientsRecords> clients) 
	{
		this.clients = clients;
	}
	
	/**
	 * Adds newClient to ClientsRecords. 
	 * @param newClient parameter in the add method
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public void add(ClientsRecords newClient) 
	{	
		clients.add(newClient);
	}


	/**
	 * @param index parameter in the remove method
	 * @return removed client from remove method
	 * @see java.util.ArrayList#remove(int)
	 */
	public ClientsRecords remove(int index) 
	{
		return clients.remove(index);
	}
	

	/**
	 * @param index the index parameter in the get method
	 * @return index 
	 * @see java.util.ArrayList#get(int)
	 */
	public ClientsRecords get(int index) 
	{
		return clients.get(index);
	}
	
	/**
	 * Does various ClientsRecords operations. 
	 * like viewing all residents records, view a resident's records, delete records, add new resident's records. 
	 * clientInfo void method
	 */
	public void clientsRecordsManager()
		{
			int apartmentNumber = 0; 
			
			int choice = 0;
			
 do {
	 				MenuOptions records = new MenuOptions();
	 	
				    records.showRecordsMenu();
				
					System.out.println("Enter a number: ");

					try
					{
					choice = keyboardInput.nextInt();

					switch (choice) 
					{
					case 1:
							//View all apartments residents records
							
							System.out.println("\nVIEW ALL RESIDENTS RECORDS:\n" + "**************************");
							
							System.out.println(getClients());
							break;

					case 2:
							//View an apartment's resident records
							
						System.out.println("Enter an apartment number to view resident's records: ");
						
						try {
							apartmentNumber = keyboardInput.nextInt();
						} 
						catch (Exception e) 
						{
							System.out.println("Invalid entry!");
							System.exit(0);
						}
											
						if(apartmentNumber > getClients().size()  )
						{
							System.out.println("No such apartment number!");
							break;
						}
						
						System.out.println(getClients().get(apartmentNumber) + "Apartment " + apartmentNumber + " records viewed successfully!\n");
							break;
													
					case 3 :
							//Delete a resident'S records
							System.out.println("Enter an apartment number to delete resident's records: ");
					
							try {
								apartmentNumber = keyboardInput.nextInt();
							} 
							catch (Exception e) 
							{
								System.out.println("Invalid entry!");
								System.exit(0);
							}
																											
							getClients().remove(apartmentNumber);
							
							System.out.println("Apartment " + apartmentNumber + " records has been deleted successfully!\n");
							
							System.out.println(getClients() );
							break;
							
					case 4 :
							//Add a new resident
							addNewResident();
						break;
						
						default:
								System.out.println("Incorrect entry!");
								break;
							}

						} 
					catch (InputMismatchException e) 
					{
						System.out.println("Input mismatch!");
						System.exit(0);
					}
			
			}while(choice >= 0 && choice <=4);
		System.out.println("You are exiting ClientsRecordsManager()!");
		}
		


		/**
		 * Registers and adds new resident client to ClientsRecords. 
		 */
		public void addNewResident() 
		{
			
			System.out.println("Please enter your first name, last name, sex, age,\n"
					+ "marital status(single or married), family size, phone number, move - in date\n");
			
			System.out.println("Enter the following information\n");
			
			
				System.out.println("Enter full name: ");		
				String fullName = "";
				int aptNumber = 0;
				String moveInDate = "";
				String leaseEndDate = "";
				int familySize = 0;
				String petType = "";
				int carParkNumber = 0;
				
				try {
					keyboardInput.nextLine();
					fullName = keyboardInput.nextLine();
					
					System.out.println("\nEnter apt number: ");
					aptNumber = keyboardInput.nextInt();
					aptNumber++;
					
					System.out.println("\nEnter moveInDate : ");
					moveInDate = keyboardInput.next();
					
					System.out.println("Enter leaseEndDate: ");
					leaseEndDate = keyboardInput.next();
					
					System.out.println("Enter familySize: ");
					familySize = keyboardInput.nextInt();	
					
					System.out.println("Enter petType: ");
					petType = keyboardInput.next();
					
					System.out.println("Enter carParkNumber: ");
					carParkNumber = keyboardInput.nextInt();
				} catch (Exception e) {
					System.out.println("Input mismatch!");
					System.exit(0);
				}
				
				System.out.println("Total before you added new resident is: " + getClients().size());
				
				anyClient = new ClientsRecords(fullName,aptNumber,moveInDate,leaseEndDate,familySize,petType,carParkNumber);
				
				add(anyClient);
				
				System.out.println("\n New total resident is now: " + clients.size());
				
				System.out.println("\nPlease check for duplicate and re-assign apt. number: ");
			
				System.out.println("Check for the new resident you added below: \n");

					for(ClientsRecords client: clients)
					{
						System.out.println(client);
					}				
			}
		
    /**
     * @return residents records information from toString method
     */
	public String toString() 
	{
	return ("\nFull Name: " + fullName + "\nApt Number: " + aptNumber + "\nMove-in Date: " + moveInDate + 
			"\nLease-end Date: " + leaseEndDate + "\nFamily Size: " + familySize + "\nPet Type: " + petType + "\nCar Park Slot number: " + carParkNumber + "\n\n");
		
}


}




