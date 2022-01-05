package methodsHomework2;

public class HomeowrkQ1 {

	public static void main(String args[]) {

		boolean amIsleeping = sleepin(true, true);

		System.out.println(amIsleeping);
	}

	public static boolean sleepin(boolean isWeekday, boolean isVacation) {

		boolean result = false;

		if (result == isWeekday || !(result == isVacation)) {

			result = true;
		} else {

			result = false;
		}

		return result;
	}
}
