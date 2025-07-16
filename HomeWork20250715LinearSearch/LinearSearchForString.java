/* Implement linear search on String[] to search for a name. Print its position if found */
public class LinearSearchForString {
	public static void main(String[] args) {

		String[] arr = {"Aeshna", "Budhau", "Akhilesh", "Pukku", "Babi", "Akku"};
		String key = "Babi";

		for(int i = 0; i < arr.length; ++i) {
			if(key.equals(arr[i])) {
				System.out.println(key + " is found at index: " + i);
				return;
			}
		}
		System.out.println(key + " is not found in the array");
	}
} 