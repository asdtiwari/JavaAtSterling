// dummy calculator
public class DummyCalculator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		char operation = '+';
		if(operation == '+') {
			System.out.println("Addition result is " + (num1 + num2));
		}
		else if(operation == '-') {
			System.out.println("Subtraction result is " + (num1 - num2));
		}
		else if(operation == '*') {
			System.out.println("Multiplication result is " + (num1 * num2));
		}
		else {
			System.out.println("Division result is " + (num1 / num2));
		}
	}
}