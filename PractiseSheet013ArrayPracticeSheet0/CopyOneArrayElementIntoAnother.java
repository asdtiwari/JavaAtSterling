/* Write a program to copy the elements from one array to another array */
public class CopyOneArrayElementIntoAnother {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("Given Array is: ");
			for(String word : args) {
				System.out.print(word + " ");
			}
			System.out.println();

			String[] arr2 = new String[args.length];
			for(int i = 0; i < arr2.length; ++i) {
				arr2[i] = args[i];
			}

			System.out.println("After copying elements into another array, another array is: ");
			for(String word : arr2) {
				System.out.print(word + " ");
			}
			System.out.println();
		} else {
			System.out.println("Pass the elements of array at the command line args");
		}
	}
}