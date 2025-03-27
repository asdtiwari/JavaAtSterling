// Write a program to find sum of all natural numbers between 1 to 100.
public class SumOfNaturalNumberUpto100UsingLoop {
	public static void main(String[] args) {
		int i = 1;
		int endNum = 100;
		int sum = 0;
		while(i <= endNum) {
			sum += i;
			++i;
		}
		System.out.println("Sum of natural number upto " + endNum + " is " + sum);
	}
}