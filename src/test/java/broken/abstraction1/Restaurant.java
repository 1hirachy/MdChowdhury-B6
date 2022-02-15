package broken.abstraction1;

public abstract class Restaurant {
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	//had to remove static keyword so that child class can have its own implementation
	public abstract void location();
	
	public void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	//we have to change non access modifier to abstract since it does not require method body
	public abstract void specialMenu();
	
	
	abstract void rating();
	//we have to remove non access modifier abstract since it has no method body
	public  void breakfastMenu() {
		System.out.println("9AM-11AM");
	}
	
	public abstract void lunchMenu(String time); // had to add parameter String time

	public abstract void dinnerMenu();
}