/* WAP to count how many times a particular element appear in the array using linear search. */
import java.util.Random;
public class CountFrequencyOfGivenElement {
	public static void main(String[] args) {
		if(args.length >= 2) {
			Random r = new Random();

			int size = Integer.parseInt(args[0]);
			int key = Integer.parseInt(args[1]);
			int seed = key + r.nextInt(2);
			int[] arr = new int[size];

			System.out.println("Array elements are: ");
			for(int i = 0; i < size; ++i) {
				arr[i] = r.nextInt(seed);
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			int count = 0;
			for(int i = 0; i < size; ++i) {
				if(key == arr[i]) {
					++count;
				}
			}

			if(count == 0) {
				System.out.println(key + " is not found in the array");
			} else {
				System.out.println(key + " is present " + count + " times");
			}

		} else {
			System.out.println("Pass the size of the array and target element using command line argument to find it in array.");
		}
	}
}