/* 1. Sort Characters by Unicode (ASCII) using Insertion Sort
Problem Description:
Write a program to sort an array of characters based on their Unicode (ASCII) values using the insertion sort algorithm.
Constraints:
•	The array can contain both lowercase, uppercase letters and symbols also.
•	Length of array: 1 <= chars.length <= 1000
Example:
Input: ['d', 'a', 'C', 'b', ' ']
Output: [' ', 'C', 'a', 'b', 'd']
Explanation:
The ASCII values are: ' '=32, 'C'=67, 'a'=97, 'b'=98, 'd'=100 → sorted accordingly. */

public class SortCharacterArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			String completeArgs = "";
			for(int i = 0; i < args.length; ++i) {
				completeArgs += args[i];
			}

			char[] array = completeArgs.toCharArray();
			System.out.println("Given Array: " + java.util.Arrays.toString(array));

			for(int i = 1; i < array.length; ++i) {
				char currentCh = array[i];
				int j = i;
				while(j > 0 && currentCh < array[j - 1]) {
					array[j] = array[j - 1];
					--j;
				}
				array[j] = currentCh;
			}

			System.out.println("Sorted Array: " + java.util.Arrays.toString(array));

		} else {
			System.out.println("Pass the character using cmd line args");
		}
	}
}