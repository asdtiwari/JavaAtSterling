/* Write a program to get second highest value from array ? */
public class SecondHighestValueFromArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			boolean isMinValueExists = false;
			int firstHighest = Integer.MIN_VALUE;
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement > firstHighest) {
					firstHighest = currentElement;
				}
				if(currentElement == Integer.MIN_VALUE) {
					isMinValueExists = true;
				}
			}

			int secondHighest = Integer.MIN_VALUE;
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement < firstHighest) {
					if(currentElement > secondHighest) {
						secondHighest = currentElement;
					}
				}
			}
			if(!isMinValueExists && secondHighest == Integer.MIN_VALUE) {
				System.out.println("All numbers are equal");
			} else {
				System.out.println("Second Highest Element is : " + secondHighest);
			}
		} else {
			System.out.println("Pass the integer elements of array at command line args");
		}
	}
}