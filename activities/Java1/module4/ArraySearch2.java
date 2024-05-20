public class ArraySearch2 {
	// SearchArray overload
	/* One method name may be used by more than one function. In order to be 		considered overloaded, methods must have the same name and different parameter 		signatures. The parameters may differ by types, order (order matters), or number 	of terms.

	The return types for the different functions may be the same or different, or void 	for no return. The return type does not matter for determining whether functions a	re overloaded. The modifiers may also be different. */

	public static boolean searchArray(String target, String[] array){
		boolean result = false;
		for(String element : array) {
			if ((element != null) && (element.equals(target))){
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static boolean searchArray(int target, int[] array){
		boolean result = false;
		for (int element : array) {
			if (element == target){
				result = true;
				break;
			}
		}
		return result;
	}
}