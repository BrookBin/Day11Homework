package methodsHomework2;

public class HomeworkQ4 {

	
	public static void main (String args []) {
		
		int diffTotal = difference21(30);
		
		System.out.println(diffTotal);
		
	}
	
	public static int difference21( int number) {
		
		int result = 0;
		
		if ( number < 21) {
			
			result =  number - 21;
			
		} else 
			
			result =  2* (number - 21);
		
		return result;
	}
}
