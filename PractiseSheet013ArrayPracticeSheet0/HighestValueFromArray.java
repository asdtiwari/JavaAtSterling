/* Write a program to get highest value from array */
public class HighestValueFromArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			int highest = Integer.parseInt(args[0]);
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement > highest) {
					highest = currentElement;
				}
			}
			System.out.println("Highest Element is: " + highest);
		} else {
			System.out.println("Pass the integer elements of array at the command line arguments");
		}
	}
}