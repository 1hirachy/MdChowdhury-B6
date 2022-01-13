package day15;

public class StaticRecapOne {

	public static boolean isJavaFun; //static variable
	String month;  //non-static variable
	
	public static int totalAmount; //static variable
	String iLikeJava; //non-static variable
	
	String country; //non-static variable
	int age; //non-static variable
	char gender; //non-static variable
	public static double temperature; //static variable

	//non-static method
	public void setCountry() {

		//TODO call [country] variable and assign value = "USA";
		country ="USA";

		//TODO  print the value of variable [country]
		System.out.println(country);

	}
		//non-static method
	public void getCountry() {

		// call method [setCountry()]
			setCountry();

		// call variable [gender] and assign value 'f'
			gender = 'F';
		
		// print the [gender] variable
			System.out.println(gender);
		
		// call variable[age] and assign value 11
			age = 11;
			
		// print variable [age]
			System.out.println(age);
			
	}
	

	//static method
	public static void addNum(int a, int b) {
		int result = a+b;	
		System.out.println(result);
		
		
		//TODO call [temperature] variable and assign value = 55.55;
				temperature = 55.55;
		
		//TODO  print the value of variable [temperature]
				System.out.println(temperature);
		
		 
	}
	
	//static method
	public static void divNum(int a, int b) {


		//TODO  call method[addNum()]
			addNum(a, b);
		System.out.println(a / b);

	}

}
