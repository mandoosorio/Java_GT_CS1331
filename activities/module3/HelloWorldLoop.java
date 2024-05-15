public class HelloWorldLoop {
	public static void main(String[] args){
		int counter = 0;
		while(counter < 10){
			System.out.println("Hello, World " + counter);
			counter++;
		}
	
		int counter2 = 0;
		do {
			System.out.println("Hello, World " + counter2);
			counter2++;
		} while (counter2 < 10);

		for (int counter3 = 0; counter3 < 10; counter3++){
			System.out.println("Hello, World " + counter3);
		}
	}
}