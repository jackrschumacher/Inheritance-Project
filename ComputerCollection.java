public class ComputerCollection extends Computer{
	// Number of computers that the user has, Type of computers that the user has
	private int maximumNumberOfComputers;
	private int numberofComputers;
	private String typeOfComputers;
	

	public ComputerCollection(){
		// Default Values
			super();
			maximumNumberOfComputers = 10;
			this.TypeOfComputer= "PC";
		}
	public createComputerCollection(int numberOfComputers, String typeOfComputers){
		// Precondition -> Get number of computers that the user has, and thier type of computers
		private String likesComputerBrand;
		if(numberofComputers >= 4 && typeOfComputers == "PC"){
			likesComputerBrand = "PC";
		}
		else if(numberOfComputer >=4 && typeOfComputers == "Mac"){
			likesComputerBrand = "Mac";
		}
		else if(numberOfComputer >=4 && typeOfComputers == "Linux"){
			likesComputerBrand = "Linux";
		}
		else{
			likesComputerBrand = "Other";
		}
		// Postconidtion -> Return what type of computers they are likley to like
		return likesComputerBrand;
	
	}
	}
}