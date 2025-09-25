/* Write a Java program to sort a numeric array and a string array. */
public class SortNumericAndStringArray {
	public static void main(String[] args) {
		int[] numbers = {7, 76, 6, 0, 4, 46, 41, 9, 200, 60, 8, 2, 91};
		
		System.out.println("Integer Array: ");
		for(int i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// Sorting int array Using Selection Sort
		for(int i = 0; i < numbers.length - 1; ++i) {
			int key = i;
			for(int j = i + 1; j < numbers.length; ++j) {
				if(numbers[key] > numbers[j]) {
					key = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[key];
			numbers[key] = temp;
		}


		System.out.println("Sorted Integer Array: ");
		for(int i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		System.out.println("\n---------------------------------------\n");

		String[] names = {"Aeshna", "Budhau", "Pukku", "Akhilesh", "Babi", "Akku"};
		
		System.out.println("String Array:");
		for(int i = 0; i < names.length; ++i) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		// Sorting string array using insertion sort
		for(int i = 0; i < names.length - 1; ++i){
			int j = i + 1; 
			String currentName = names[j];
			while(j > 0 && currentName.compareTo(names[j - 1]) < 0) {
				names[j] = names[j - 1];
				--j;
			}
			names[j] = currentName;
		}


		System.out.println("Sorted String Array:");
		for(int i = 0; i < names.length; ++i) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
}