/* Write a Java program to sum values of an array. */
public class AddValuesOfArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			int sum = 0; 
			for(int i = 0; i < args.length; ++i) {
				sum = sum + Integer.parseInt(args[i]);
			}
			System.out.println("Sum is : " + sum);
		} else {
			System.out.println("Pass the integers element using command line argument to get the sum");
		}
	}
}