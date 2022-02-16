package broken.abstraction2;

public interface Doordash {
	
	/** interface cannot have constructor
	public Doordash(String name, int duration) {	
		System.out.println("Name:" + name);
		System.out.println("Duraiton:" + duration);
	} */
	
	public abstract void delivery();	
	public abstract void fee();	
	// had to change access modifier because default access modifier requires method body
	public abstract void pickUp();  
	
	//had to change return type
	default void getLocation() {	
		System.out.println("Rest Town Center");
	}
	//had to change return type to String
	public static String setLocation(String location) {		
		location = "Reston";	
		System.out.println(location);
		return location;
	}
}
