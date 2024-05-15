import java.util.Scanner;

public class FahrenheitToCelsiusInput {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //read keyboard input
		System.out.print("Enter a Fahrenheit value: ");
		int fahrenheit = input.nextInt();
		input.nextLine();
		System.out.print("Enter the day of the week: ");
		String day = input.nextLine();
		System.out.print("Enter your preferred Celsius label (Celsius, Centigrade, C): ");
		String cText = input.next();
		double celsius = (5.0/9) * (fahrenheit - 32);
		System.out.println(day + " Fahrenheit : " + fahrenheit);
		System.out.println(day + " Celsius : " + celsius);
		System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit);
		System.out.printf("%s Celsius: %f\n", day, celsius);
		System.out.printf("%s Celsius: %.1f\n", day, celsius);
		System.out.printf("%s %10s: %.1f\n", day, cText, celsius);
		System.out.printf("%s %-10s: %.1f\n", day, cText, celsius);
		System.out.printf("%s %-10s: %,.1f\n", day, cText, celsius);
	}
}