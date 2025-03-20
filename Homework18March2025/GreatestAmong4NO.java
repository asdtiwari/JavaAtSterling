// Find Largest no. among 4 numbers [if largest numbers are equal then equal number should announce]

public class GreatestAmong4NO {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;

		if(num1 > num2) {
			if(num1 > num3) {
				if(num1 > num4) {
					System.out.println("num1 (" + num1 + ") is greatest");
				}
				else if(num1 == num4) {
					System.out.println("num1, num4 (" + num1 + ") both are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else if(num1 == num3) {
				if(num1 > num4) {
					System.out.println("num1, num3 (" + num3 + ") both are greater among all");
				}
				else if(num1 == num4) {
					System.out.println("num1, num3, num4 (" + num1 + ") thrice are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else {
				if(num3 > num4) {
					System.out.println("num3 (" + num3 + ") is greatest");
				}
				else if(num3 == num4) {
					System.out.println("num1, num4 (" + num4 + ") both are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
		}
		else if(num1 == num2) {
			if(num1 > num3) {
				if(num1 > num4) {
					System.out.println("num1, num2 (" + num1 + ") both are greater among all");
				}
				else if(num1 == num4) {
					System.out.println("num1, num2, num4 (" + num1 + ") thrice are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else if(num1 == num3) {
				if(num1 > num4) {
					System.out.println("num1, num2, num3 (" + num1 + ") thrice are greater among all");
				}
				else if(num1 == num4) {
					System.out.println("num1, num2, num3, num4 (" + num1 + ") all are greater");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else {
				if(num3 > num4) {
					System.out.println("num3 (" + num3 + ") is greatest");
				}
				else if(num3 == num4) {
					System.out.println("num3, num4 (" + num4 + ") both are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
		}
		else {
			if(num2 > num3) {
				if(num2 > num4) {
					System.out.println("num2 (" + num2 + ") is greatest");
				}
				else if(num2 == num4) {
					System.out.println("num2, num4 (" + num2 + ") both are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else if(num2 == num3) {
				if(num2 > num4) {
					System.out.println("num2, num3 (" + num2 + ") both are greater among all");
				}
				else if(num2 == num4) {
					System.out.println("num2, num3, num4 (" + num2 + ") thrice are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
			else {
				if(num3 > num4) {
					System.out.println("num3 (" + num3 + ") is greatest");
				}
				else if(num3 == num4) {
					System.out.println("num3, num4 (" + num3 + ") both are greater among all");
				}
				else {
					System.out.println("num4 (" + num4 + ") is greatest");
				}
			}
		}
	}
}