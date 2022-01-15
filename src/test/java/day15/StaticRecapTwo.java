package day15;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {

		// TODO call [isJavaFun] variable and assign value = true
		StaticRecapOne.isJavaFun = true;

		// TODO call [totalAmount] variable and assign value = 1111
		StaticRecapOne.totalAmount = 1111;

		// TODO print value of variable [isJavaFun]
		System.out.println(StaticRecapOne.isJavaFun);

		// TODO print value of variable [totalAmount]
		System.out.println(StaticRecapOne.totalAmount); // printing static variable from different class -->
														// className.variableName

		// TODO call method [addNum()]
		StaticRecapOne.addNum(0, 0);

	}

	// non-static method
	public void statusUpdate() {

		StaticRecapOne obj = new StaticRecapOne(); // creating new object = obj

		// TODO call [month] variable and assign value = "January"
		obj.month = "January";

		// TODO call [iLikeJava] variable and assign value = "Java is life"
		obj.iLikeJava = "Java is life";

		// TODO print value of variable [month]
		System.out.println(obj.month);

		// TODO print value of variable [iLikeJava]
		System.out.println(obj.iLikeJava);

		// TODO call method [getCountry()]
		obj.getCountry();

	}

	public static void main(String[] args) {

		// TODO call method [getInfo()]
		getInfo(); // since we are getting static method from the same class we can just call it by
					// methodName

	}
}

/**
 * the question i have is this, why we are creating object under getInfo method
 * instead of main method.
 */