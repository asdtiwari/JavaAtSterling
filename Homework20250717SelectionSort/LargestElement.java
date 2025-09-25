/* Find and print largest element using selection sort */
public class LargestElement {
	public static void main(String[] args) {
		if(args.length == 1 && args[0].matches("[0-9]+") && args[0].length() < 9) {
			int length = Integer.parseInt(args[0]);

			int[] array = new int[length];
			for(int i = 0; i < array.length; ++i) {
				array[i] = (int)(Math.random() * length);
			}
			System.out.println("Given Array: " + java.util.Arrays.toString(array));

			for(int i = 0; i < array.length - 1; ++i) {
				int smallestIdx = i;
				for(int j = i + 1; j < array.length; ++j) {
					if(array[smallestIdx] > array[j]) {
						smallestIdx = j;
					} 
				}
				if(smallestIdx != i) {
					int temp = array[i];
					array[i] = array[smallestIdx];
					array[smallestIdx] = temp;
				}
			}
			System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
			System.out.println("Largest Element is " + array[array.length - 1]);
		} else {
			System.out.println("Pass the size of array in cmd line args");
		}
	}
}