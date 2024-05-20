public class ComparisonTest{
	public static void main(String[] args){
		// 4 unicode is 34
		// lowercase a unicode is 97
		String x = "park";
		String y = "p4rk";

		if(x.compareTo(y) > 0){
			System.out.println("x is greater than y");
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	}
}