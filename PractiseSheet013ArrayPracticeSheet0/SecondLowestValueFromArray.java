/* Write a program to get second lowest value from array ? */
public class SecondLowestValueFromArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			boolean isMaxValueExists = false;
			int firstLowest = Integer.MAX_VALUE;
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement < firstLowest) {
					firstLowest = currentElement;
				}
				if(currentElement == Integer.MAX_VALUE) {
					isMaxValueExists = true;
				}
			}

			int secondLowest = Integer.MAX_VALUE;
			for(int i = 0; i < args.length; ++i) {
				int currentElement = Integer.parseInt(args[i]);
				if(currentElement > firstLowest) {
					if(currentElement < secondLowest) {
						secondLowest = currentElement;
					}
				}
			}
			if(!isMaxValueExists && secondLowest == Integer.MAX_VALUE) {
				System.out.println("All numbers are equal");
			} else {
				System.out.println("Second Lowest Element is : " + secondLowest);
			}
		} else {
			System.out.println("Pass the integer elements of array at command line args");
		}
	}
}