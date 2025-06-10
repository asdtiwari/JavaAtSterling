/* Write a progarm to remove first occurrence of a character from string */
public class RemoveFirstOccurrence {
	public static void main(String[] args) {
		String str = "My name is Akhilesh Tiwari. I am pursuing Bachelor of Technlogy from Medicaps University.";

		char key = 'I';
		int indexOfKey = str.indexOf(key);

		if(indexOfKey >= 0) {
			System.out.println("Before removing: " + str);
			System.out.println();
			System.out.println("After removing first occurence of \'" + key + "\' : " + str.substring(0, indexOfKey) + str.substring(indexOfKey + 1));
		} else {
			System.out.println(key + " is not present");
		}
	}
}
		