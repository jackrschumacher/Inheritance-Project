class Computer{
	// User of the computer name, user's preffered oeprating system
	private userName;
	private userPrefferedOperatingSystem;
	

	public Computer(String userName,String userPrefferedOperatingSystem){
		
		this.userName = "Jack Schumacher";
		this.userPrefferedOperatingSystem = "PC";
		
	}
	public Computer(){
		
		this.userName = "User";
		this.userPrefferedOperatingSystem = "Unkown";
		
	}
	public String ComputerAssign(String userPrefferedOperatingSystem){
		// Precondition -> Get users preferred operating system
		private String computerName;
		if(userPrefferedOperatingSystem == "PC"){
			computerName = "Lenovo X1 Carbon";
		}
		else if(userPrefferedOperatingSystem == "Mac"){
			computerName = "Macbook Pro";
		}
		else if(userPrefferedOperatingSystem == "Linux"){
			computerName = "Oryx Pro";
		}
		else{
			computerName = "Unknown";
		}
		// Postcondition -> Return random computer based on computer brand that the user likes
		return computerName;
		
	}
	
		
}

