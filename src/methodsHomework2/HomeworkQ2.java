package methodsHomework2;

public class HomeworkQ2 {

	public static void main(String args[]) {

		boolean areWeinTrouble = monkeyTrouble(true, true);
		System.out.println(areWeinTrouble);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		boolean result = false;

		if ((result == aSmile && result == bSmile) || (!(result == aSmile) && (!(result == bSmile)))) {

			result = true;
		} else {

			result = false;
		}

		return result;
	}

}
