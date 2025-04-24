/* Write a program to find HCF(Highest Common Factor) of two numbers. */
public class HCFofTwoNumbers {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 100;
		while(num1 % num2 != 0) {
			int tmp = num1 % num2;
			num1 = num2;
			num2 = tmp;
		}
		System.out.println("HCF is : " + num2);
	}
}


     
				
			