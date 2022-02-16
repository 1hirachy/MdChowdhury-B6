package broken.abstraction2;

// this class should inherit DoorDash && Healthy
public class Subway implements Doordash, Healthy {
	
	int amount;
	String name;
	public Subway(String name, int duration) {
		//super(name, duration); interface don't have constructor
		
		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}
	public void setPrice(double price) {
		System.out.println("Price: "+ price);

	}
	
	@Override
	public void delivery() {
		
	}
	
	@Override
	public void fee() {
		
	}
	
	@Override
	public void pickUp() {
		
	}
	
	@Override
	public void setCalories() {
		
	}
}
