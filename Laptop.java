public class Laptop extends Computer{
	//Precondition : New Laptop is intialized in the main method
	public String laptop(){
		// Battery life of laptop, screen size of laptop, CPU type, if battery is charged
		private int batteryLife;
		private int screenSize;
		private String CPU;
		private boolean batteryCharge = false;

		public Status{
			super(userName,userPrefferedOperatingSystem);
			this.userName = "Jack";
			this.userPrefferedOperatingSystem = "Mac";
			this.screenSize = screenSize;
			batteryLife = 5;
		}
		public void batteryCharge(boolean isCharged, int batteryCharge){
			// Precondition - Bettery Is charged or not
			if(isCharged == false){
				batteryCharge = batteryCharge + 50;
			}
			else(isCharged){
				batteryCharge = 100;
			}
		// Postcondition - Battery is charged if dead
			return batteryCharge;
		}
		
		
	}
}
