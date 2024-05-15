public class PrimitiveOperations {
	public static void main(String[] args){
		int num1 = 5;
		double num2 = 3.5;

		System.out.println(num1);
		System.out.println(num2);
		
		double num3 = num1 * num2;
		System.out.println(num3);

		// casting to convert integer to float number
		float num4 = (float) num3;
		System.out.println(num4);
		
		// casting to convert float to integer number
		int num5 = (int) num4;
		
		System.out.println(num5);

		char letter1 = 'V';
		System.out.println(letter1);

		// convert V to lowercase using numerical operation
		String letter2 = String.valueOf(letter1);
		System.out.println(letter2);
		String letter3 = letter2.toLowerCase();
		System.out.println(letter3);
	}
}

		
	