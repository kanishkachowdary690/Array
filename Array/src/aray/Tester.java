package aray;
class Tester{
	
 static int[] findLeapYears(int year) {
		int[] ans = new int[15];
		int first = year;
		while (true) {
			if (first % 4 == 0) {
				if (first % 100 == 0) {
					if (first % 400 == 0) {
						break;
					}
				}
			} else {
			    first++;
			}
			
		}
		int a = 0;
		for (int i = first; a < ans.length; i += 4) {
			if (i % 100 == 0 && i % 400 != 0) {
				continue;
			}
			ans[a++] = i;
		}
		// Implement your code here and change the return value accordingly
		return ans;
	}
	public static void main(String args[]) {
		int year = 2000;
		int[] leapYears;
		leapYears =findLeapYears(year);
		for (int index = 0; index < leapYears.length; index++) {
			System.out.println(leapYears[index]);
		}
	}}

