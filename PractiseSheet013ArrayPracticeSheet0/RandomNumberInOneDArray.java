/* Write a program to create a One D Array and insert Random numbers */
import java.util.Random;
public class RandomNumberInOneDArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			Random r = new Random();
			int sizeOfArray = Integer.parseInt(args[0]);
			int arr[] = new int[sizeOfArray];
			int seed = arr.length * 100;
			for(int i = 0; i < arr.length; ++i) {
				arr[i] = r.nextInt(seed);
			}

			System.out.println("Array of size " + sizeOfArray + " with random elements:");
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		} else {
			System.out.println("Enter the size of array at command line args");
		}
	}
}