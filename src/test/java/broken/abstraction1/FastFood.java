package broken.abstraction1;

//since we are inheriting abstract class we have to use extends keyword
public  class FastFood extends Restaurant { 
	
	// we had to explicitly call our parent class constructor parameter via super keyword
	public FastFood(String name, int luckyNumber, int waitTime) {
		super(name, luckyNumber, waitTime);
	}
	
	//had to change access modifier to public so we can have visibility
	@Override
	public void location() {
		System.out.println("Reston VA");
	}
	
	@Override // we cannot override static method in child class
	public void setOperationTime() {
		System.out.println("24/7");
	}
	
	@Override //
	public void specialMenu() {
		System.out.println("Special Menu");
	}
	
	@Override
	public void lunchMenu(String time) {
		System.out.println("Time: " + time);
	}
	
	@Override // we had to change access modifier to public in order to restore visibility
	public void breakfastMenu() { //fixed spelling error
		System.out.println("Not serving...");
	}
	
	@Override 
	public void dinnerMenu() { //we are adding return type to the method & spelling error
		System.out.println("7PM-10PM");
	}
	
	@Override //added rating method since it was an abstract method in parent class we have to force implementation
	protected void rating() {
		System.out.println("Rating is 7");
	}
	public void display() {
		
		//We cannot reinitialize final variable valeue
		//DISCOUNT = 30.00;
		
		super.luckyNumber = 22;
		
		super.waitTime = 0; // = "NONE";
		
		rating(); // we can call them directly
	}
	
	//we cannot have abstract method in concrete class
	public  void getInfo() {
		System.out.println("This is info");
	}
	//we cannot have abstract method in concrete class
	//public abstract void setInfo();

}
