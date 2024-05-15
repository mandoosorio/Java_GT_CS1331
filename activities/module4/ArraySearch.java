public class ArraySearch {
	public static void main(String args[]) {
		String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};
		String result = "not found";
	
		for(String concept : concepts){
			if(concept.equals("polymorphism")){
				result = "found";
				break;
			}
		}
		System.out.println(result);

		result = searchStringArray("inheritance", concepts);
		System.out.println(result);
	}

	public static String searchStringArray(String target, String[] array) {
		String result = "not found";
	
		for(String element : array){
			if(element.equals(target)){
				result = "found";
				break;
			}
		}
		return result;
	}
		
}