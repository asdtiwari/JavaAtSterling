/* WAP to find the smallest element within an array using linear serach method */
import java.util.Random;
public class SmallestElementInArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			int size = Integer.parseInt(args[0]);
			if(size == 0) {
				return;
			}

			int[] arr = new int[size];

			Random r = new Random();
			int seed = size * 2;
			
			System.out.println("Array is: ");
			for(int i = 0; i < arr.length; ++i) {
				arr[i] = r.nextInt(seed);
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			int smallest = arr[0];
			for(int i = 1; i < arr.length; ++i) {
				if(smallest > arr[i]) {
					smallest = arr[i];
				}
			}
			System.out.println(smallest + " is the smallest number in the array");
			
		} else {
			System.out.println("Pass the size of array in command line argument");
		}
	}
}