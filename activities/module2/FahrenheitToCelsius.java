public class FahrenheitToCelsius {
	public static void main(String[] args){
		int saturdayFahrenheit;
		int sundayFahrenheit;

		saturdayFahrenheit = 78;
		sundayFahrenheit = 81;
	
		// using 5.0 with decimal prevents from getting an inaccurate conversion at the end
		double saturdayCelsius = (5.0/9) * (saturdayFahrenheit - 32);
		double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);

		System.out.println("Saturday: " + saturdayCelsius);
		System.out.println("Sunday: " + sundayCelsius);
	}
}