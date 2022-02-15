package broken.abstraction1;

public class RestaurantDemo {
	
	public static void main(String[] args) { //removed parenthesis
	
		//cannot instantiate an abstract class
	/**	Restaurant obj1 = new Restaurant();
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		*/
		Restaurant obj2 = new FastFood("Mcdonald", 7, 5);
	//EXPECTED ERROR	obj2.getInfo(); this method belong to child class & don't have access for obj2
	//EXPECTED ERROR	obj2.setInfo(); this method belong to child class & don't have access for obj2
		
		FastFood obj3 = new FastFood("John Cena", 12, 20);
		
		//obj3.DISCOUNT = 44.44;
		//we can not reinitialize FINAL variable value but we can print it by calling objectnName.VariableName
		System.out.println(obj3.DISCOUNT);
		obj3.dinnerMenu(); // we can call this method directly
		obj3.lunchMenu("12PM-3PM"); // we can call this method directly & had to add String parameter value
		
		
	}
 

}
