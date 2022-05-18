package aray;

class Tester14 {
	public static String removeWhiteSpaces(String str) {
		// Implement your code here and change the return value accordingly
		String str1 ="";
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ') {
				str1 = str1 + str.charAt(i);
			}
		}
		return str1;
	}

	public static void main(String args[]) {
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}
