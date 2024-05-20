public class EqualityTest {
	public static void main(String[] args){
		String x = "park";
		String y = "home";
		String z = new String("park");
		
		if(x == y){
			System.out.println("x and y are aliases");
		}
		
		if(x != y){
			System.out.println("x and y are not aliases");
		}

		if(x.equals(y)){
			System.out.println("x and y have the same contents");
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}

		if(x == z){
			System.out.println("x and z are aliases");
		}
		
		if(x != z){
			System.out.println("x and z are not aliases");
		}

		if(x.equals(z)){
			System.out.println("x and z have the same contents");
			System.out.println("x: " + x);
			System.out.println("z: " + z);
		}
	}
}