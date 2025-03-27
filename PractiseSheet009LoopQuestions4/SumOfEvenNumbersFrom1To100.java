// Write a program to find sum of all even numbers between 1 to 100.

public class SumOfEvenNumbersFrom1To100 {
	public static void main(String[] args) {
		int i = 1;
		int endNum = 100;
		int sum = 0;
		while(i <= endNum) {
			if(i % 2 == 0) {
				sum += i;
			}
			++i;
		}
		System.out.println("Sum of all even numbers between 1 to 100 is " + sum);
	}
}