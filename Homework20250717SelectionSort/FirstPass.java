/* If you have an arra [50, 20, 40] the array look like after first pass of selection sort */
public class FirstPass {
	public static void main(String[] args) {
		if(args.length == 1 && args[0].matches("[0-9]+") && args[0].length() < 9) {
			int length = Integer.parseInt(args[0]);

			int[] array = new int[length];
			for(int i = 0; i < array.length; ++i) {
				array[i] = (int)(Math.random() * length);
			}
			System.out.println("Given Array: " + java.util.Arrays.toString(array));

			int smallestIdx = 0;
			for(int j = 1; j < array.length; ++j) {
				if(array[smallestIdx] > array[j]) {
					smallestIdx = j;
				} 
			}
			if(smallestIdx != 0) {
				int temp = array[0];
				array[0] = array[smallestIdx];
				array[smallestIdx] = temp;
			}
			System.out.println("After first pass, Array is: " + java.util.Arrays.toString(array));
		} else {
			System.out.println("Pass the size of array in cmd line args");
		}
	}
}