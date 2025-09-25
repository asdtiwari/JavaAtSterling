/* Find the K-th largest element in an array using Bubble Sort */
import java.util.Random;
public class KthLargestElement {
	public static void main(String[] args) {
		if(args.length == 1) {
			if(args[0].matches("[0-9]+") && args[0].length() < 9) {
				int kth = Integer.parseInt(args[0]);

				int[] array = new int[kth * 2];
				Random random = new Random();
				int seed = array.length + kth;
				for(int i = 0; i < array.length; ++i) {
					array[i] = random.nextInt(seed);
				}

				for(int i = 0; i < array.length - 1; ++i) {
					boolean noSwap = true;
					for(int j = 0; j < array.length - i - 1; ++j) {
						if(array[j] > array[j + 1]) {
							int temp  = array[j];
							array[j] = array[j + 1];
							array[j + 1] = temp;
							noSwap = false;
						}
					}
					if(noSwap) {
						break;
					}
				}

				System.out.println("Array is: " + java.util.Arrays.toString(array));
				System.out.println(kth + " largest element is: " + array[array.length - kth]);
			} else {
				System.out.println("Enter valid number");
			}
		} else {
			System.out.println("Enter the kth value in cmd line array");
		}
	}
}