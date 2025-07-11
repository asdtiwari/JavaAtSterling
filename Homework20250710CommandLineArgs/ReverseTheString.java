// WAP to reverse the given String using CLI
public class  ReverseTheString {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				char[] arr = word.toCharArray();
				for(int i = 0, len = word.length(), halfLen = len / 2; i < halfLen; ++i) {
					char temp = arr[i];
					arr[i] = arr[len - 1 - i];
					arr[len - 1 - i] = temp;
				}
				String rev = new String(arr);
				System.out.println("Reverse of " + word + " is " + rev);
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}