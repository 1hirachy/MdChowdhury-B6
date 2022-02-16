package broken.abstraction2;

public class DoordashDemo {

	public static void main(String[] args) {

		/**
		 * unable to create object of an interface DoorDash obj1 = new DoorDash("John",
		 * 123); Healthy obj2 = new Healthy();
		 */

		Doordash obj3 = new Subway("Food", 20); // had to fix reference variable name & add parameter value
		// obj3.setPrice(22.22); unable to access setPrie method since it was not
		// inherited from parent class

		/**
		 * since there is no is a relationship between Chiptole and Subway so we can
		 * upcast Subway obj4 = new Chipotle(); obj4.fee();
		 */
		/**
		 * since there is no is a relationship between Chiptole and Subway so we can
		 * upcast Chipotle obj4 = new MyChoice(); obj4.setPrice();
		 */
		Subway obj5 = new Subway("MD", 22);

		obj5.amount = 15;
		obj5.name = "Subway";

		System.out.println(obj5.amount);
		System.out.println(obj5.name);

	}
}
