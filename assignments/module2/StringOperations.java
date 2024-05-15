public class StringOperations {
	public static void main(String[] args){
		String name = "Mando";
		System.out.println(name);

		char firstLetter = name.charAt(0);
		System.out.println(firstLetter);

		String name2 = name.replaceFirst(name.valueOf(firstLetter), "A");
		System.out.println(name2);

		char lastLetter = name.charAt(name.length() - 1);
		System.out.println(lastLetter);
		
		String name3 = name2.replaceFirst(name2.valueOf(lastLetter), "Z");
		System.out.println(name3);

		String url1 = "www.ova.com";
		System.out.println(url1);
		
		String[] urlArr = url1.split("\\.", 0);
		System.out.println(urlArr);

		for (String a : urlArr){
			System.out.println(a);
		}

		String finalStr = urlArr[0] + "." + urlArr[1] + "1331" + "." + urlArr[2];
		System.out.println(finalStr);
		
	}
}