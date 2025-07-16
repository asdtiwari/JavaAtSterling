/* Write a program to get the lowest value from array? */
public class LowestValueFromArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			int lowest = Integer.parseInt(args[0]);
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement < lowest) {
					lowest = currentElement;
				}
			}
			System.out.println("Lowest Element is: " + lowest);
		} else {
			System.out.println("Pass the integer elements of array at the command line arguments");
		}
	}
}