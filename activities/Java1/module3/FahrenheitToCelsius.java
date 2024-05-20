import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		final int MIN_PARK_TEMP = 70;
		final int MAX_PARK_TEMP = 90;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit value: ");
		
		int fahrenheit = input.nextInt();
		System.out.print("Enter a day of the week: ");
		
		String day = input.next();
		double celsius = (5.0/9) * (fahrenheit - 32);
		boolean raining = false;
		
		System.out.print("Is it raining? (y/n): ");
		String rainInput = input.next().toLowerCase();
		
		if(rainInput.startsWith("y")){
			raining = true;
		}
		System.out.println(day + " Fahrenheit: " + fahrenheit);
		System.out.printf("%s %.1f \n", day + " Celsius:", celsius);

		if ((fahrenheit >= MIN_PARK_TEMP) && (fahrenheit <= MAX_PARK_TEMP) && !raining) {
			System.out.println("Go to the beach");
		}
		else {
			System.out.println("Stay home");
		}
	}
}