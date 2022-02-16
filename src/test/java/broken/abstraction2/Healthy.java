package broken.abstraction2;

public interface Healthy {

	//	int amount;  we have to initialize variable value
	//	String name;	
	/** Healthy(int calorie) {
		System.out.println("Calorie: " + calorie );
	}*/
	/**  interface cannot have constructor
	public Healthy(int calorie, int amount) {
		System.out.println("Amount: " + amount);
		System.out.println("Calorie:" + calorie);
	}*/
	
	//changed modifiers to default so we can have method body
	 default void getCalories(String type) {
		System.out.println("Organic");
	}
	public abstract void setCalories();
}