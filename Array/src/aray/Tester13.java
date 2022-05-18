package aray;

class Tester13 {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers =new int[] {0,0,0,0,0,0};
		
		// Implement your code here
		if (num1 < num2) {
			int j = 0;
			for (int i = (num1 + 1); i <= num2; i++) {
				int sum = 0, r, temp = i;
				while (temp > 0) {
					r = temp % 10;
					sum += r;
					temp = temp / 10;
				}
				if (sum % 3 == 0 && i % 5 == 0) {
					numbers[j] = i;
					
					j++;
				}
				
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.print(numbers[index]+",");
			}
		}

	}
}