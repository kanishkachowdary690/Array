package aray;
class Calculator {
    long num,sum=0;
public  void sumOfDigits(){
    long r;
   while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
}
public void display(){
    System.out.println(sum);
}
	
}

class Tester7 {

	public static void main(String args[]) {

		Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        calculator1.num=123;
        calculator2.num=6547;
        calculator1.sumOfDigits();
        calculator1.display();
        calculator2.sumOfDigits();
        calculator2.display();
	}
}