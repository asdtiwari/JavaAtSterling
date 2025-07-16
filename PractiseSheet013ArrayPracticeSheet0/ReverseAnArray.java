/* Write a program to reverse an array */
public class ReverseAnArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("Given Array is: ");
			for(String word : args) {
				System.out.print(word + " ");
			}
			System.out.println();

			int len = args.length;
			int halfLen = len / 2;
			for(int i = 0; i < halfLen; ++i) {
				String temp = args[i];
				args[i] = args[len - 1 - i];
				args[len - 1 - i] = temp;
			}

			System.out.println("After reversal, Array is: ");
			for(String word : args) {
				System.out.print(word + " ");
			}
			System.out.println();
		} else {
			System.out.println("Pass the elements of array at command line argument");
		}
	}
}