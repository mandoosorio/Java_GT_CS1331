import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an operation (add, subtract, multiply, divide, alphabetize): ");
		String selection = input.next().toLowerCase();
		
		int operationResult;
		double divideResult;
		String textResult;

		switch(selection){
			case "add":
				operationResult = add();
				System.out.println(operationResult);
				break;
			case "subtract":
				operationResult = subtract();
				System.out.println(operationResult);
				break;
			case "multiply":
				operationResult = multiply();
				System.out.println(operationResult);
				break;
			case "divide":
				divideResult = divide();
				System.out.printf("%.2f \n", divideResult);
				break;
			case "alphabetize":
				textResult = alphabetize();
				System.out.println(textResult);
				break;
			default:
				System.out.println("Invalid input entered. Terminating...");
				break;
		}
	}

	public static int add(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		return num1 + num2;
	}

	public static int subtract(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		return num1 - num2;
	}

	public static int multiply(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		return num1 * num2;
	}

	public static double divide(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two doubles: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		if(num2 == 0){
			System.out.println("Divide by 0 error");
			return 0;
		} else {
			return num1 / num2;
		}
	}

	public static String alphabetize(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two words: ");
		String text1 = input.next().toLowerCase();
		String text2 = input.next().toLowerCase();
		
		if(text1.compareTo(text2) == 0){
			return "Bacon and Eggs";
		}
		else if(text1.compareTo(text2) < 0 && text1.charAt(0) < text2.charAt(0)){
			return text1 + " " + text2;
		}
		else {
			return text2 + " " + text1;
		}
	}
		
}