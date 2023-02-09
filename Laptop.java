public class Laptop extends Computer{
	//Precondition : New Laptop is intialized in the main method
	public String laptop(){
		private int batteryLife;
		private int screenSize;
		private String CPU;
		private boolean batteryCharge = true;

		public Status(int batteryLife, int screenSize, private String CPU ){
			super(batteryLife, screenSize, CPU);
			this.screenSize = screenSize;
			batteryLife = 5;
		}
		public void batteryCharge(){
			if(!isCharged){
				isCharged = false;
				batteryCharge = batteryCharge + 50;
			}
		// Postcondition - Battery is charged if dead
		}
		
		
	}
}
