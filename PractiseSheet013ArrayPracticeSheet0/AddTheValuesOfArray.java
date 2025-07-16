/* Write a program to add the values of an array ? */
public class AddTheValuesOfArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			long sum = 0;
			for(String word : args) {
				if(!word.matches("[0-9]+")) {
					System.out.println(word + " can't convert into integer");
				} else {
					sum = sum + Long.parseLong(word);
				}
			}
			System.out.println("Sum of values is " + sum);
		} else {
			System.out.println("Please, pass the integer values to add at command line args");
		}
	}
}