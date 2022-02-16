package broken.abstraction2;

//This class should inerhit Subway
public class MyChoice extends Subway {

	@Override // had to change access modifier & parameter
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}
	//had to create constructor & explicitly call immediate parent class constructor
	
	public MyChoice(String name, int duration) {
		super(name, duration);
	}
}
