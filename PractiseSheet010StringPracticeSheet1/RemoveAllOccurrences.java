/* WAP to remove all occurrence of a character from string. */
public class RemoveAllOccurrences {
	public static void main(String[] args) {
		String str = "My name is Akhilesh Tiwari. I am currently pursuing Bachelor of Technology from Medicaps University and working as a Java trainee from Sterling Institute.";

		char key = 'y';
		char replace = 0;

		System.out.println("Original String :" + str + '\n');
		System.out.println("After removing '" + key + "' from String: " + str.replace(key, replace));
	}
}