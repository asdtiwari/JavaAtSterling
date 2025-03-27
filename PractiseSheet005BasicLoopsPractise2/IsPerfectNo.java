//  Write a program to check whether a number is Perfect number or not. 
public class IsPerfectNo {
	public static void main(String[] args) {
		int num = 6;
		int sumOfFactor = 0;
		int fact = 1;
		while(fact <= num / 2) {
			if(num % fact == 0) {
				sumOfFactor += fact;
			}
			++fact;
		}
		if(sumOfFactor == num) {
			System.out.println(num + " is Perfect No.");
		}
		else {
			System.out.println(num + " isn't Perfect No.");
		}
	}
}