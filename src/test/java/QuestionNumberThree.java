
public class QuestionNumberThree {
	public static void main(String[] args) {
		int totalNumber = 0;
		int count = 0;

		for (int n = 20; n <= 30; n++) {
			totalNumber = totalNumber + n;
			count++;
		}
		System.out.println((totalNumber / count) + " is the average number");
		System.out.println("****************While Loop*************");

		int totalNum = 0;
		int count2 = 0;
		int n = 20;
		while (n <= 30) {
			totalNum = totalNum + n;
			n++;
			count2++;
		}
		System.out.println(totalNum / count2);
		System.out.println("****************Do While Loop*************");

		int totalNum2 = 0;
		int count3 = 0;
		int i = 20;
		do {
			totalNum2 = totalNum2 + i;
			System.out.println(totalNum2 / count3);
			totalNum2 = totalNum2 + i;
			i++;
			count3++;
		} while (i <= 30);

	}
}
