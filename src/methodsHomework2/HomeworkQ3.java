package methodsHomework2;

public class HomeworkQ3 {

	public static void main(String args[]) {

		int a = 2;
		int b = 2;

		int myTotal = sumDouble(a, b);
		System.out.println(myTotal);

	}

	public static int sumDouble(int valueOne, int valueTwo) {

		int result = 0;

		if (valueOne == valueTwo) {

			result = 2 * (valueOne + valueTwo);
		} else {

			result = valueOne + valueTwo;
		}

		return result;

	}

}
