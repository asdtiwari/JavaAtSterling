/* Write a progarm to remove last occurrence of a character from string */
public class RemoveLastOccurrence {
	public static void main(String[] args) {
		String str = "My name is Akhilesh Tiwari. I am pursuing Bachelor of Technlogy from Medicaps University.";

		char key = 'i';
		int lastIndexOfKey = str.lastIndexOf(key);

		if(lastIndexOfKey >= 0) {
			System.out.println("Before removing: " + str);
			System.out.println();
			System.out.println("After removing last occurence of \'" + key + "\' : " + str.substring(0, lastIndexOfKey) + str.substring(lastIndexOfKey + 1));
		} else {
			System.out.println(key + " is not present");
		}
	}
}
		