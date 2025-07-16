/* Write a program to remove a particular element from an array ? */
public class RemoveParticularElementFromArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			int[] arr = new int[args.length - 1];

			for(int i = 0; i < args.length - 1; ++i) {
				arr[i] = Integer.parseInt(args[i]);
			}

			System.out.println("Given Array is: ");
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();

			int removalElementIndex = Integer.parseInt(args[args.length - 1]);
			for(int i = removalElementIndex; i < arr.length - 1; ++i) {
				arr[i] = arr[i + 1];
			}

			System.out.println("After removing index " + removalElementIndex + ", Array is: ");
			for(int i = 0; i < arr.length - 1; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		} else {
			System.out.println("Pass the integer values of array and lastly index of element (using command line args) to remove it from the array.");
		}
	}
}