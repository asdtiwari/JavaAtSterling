/* Sort an array in ascending order using Bubble Sort */
public class BubbleSort {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("Given Array: " + java.util.Arrays.toString(args));
			int len = args.length;
			for(int i = 0; i < len - 1; ++i) {
				for(int j = 0; j < len - i - 1; ++j) {
					if(args[j].compareTo(args[j + 1]) > 0) {
						String temp = args[j];
						args[j] = args[j + 1];
						args[j + 1] = temp;
						noSwap = false;
					}
				}
			}
			System.out.println("After Sorting, Array is: " + java.util.Arrays.toString(args));
		} else {
			System.out.println("Pass the words in cmd line args to sort lexicographically.");
		}
	}
}