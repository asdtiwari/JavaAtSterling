/* Write a program to calculate the average value of array?  */
public class AverageValueOfTheArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			double sum = 0;
			int count = 0;
			for(String word : args) {
				if(!word.matches("[+-]?[0-9]*[.]?[0-9]+")) {
					System.out.println(word + " is not a number");
				} else {
					sum = sum + Double.parseDouble(word);
					++count;	
				}
			}
			System.out.println("\n" + "Average to the numbers is: " + (sum / count));
		} else {
			System.out.println("Please, pass numeric values to calculate the average values");
		}
	}
}