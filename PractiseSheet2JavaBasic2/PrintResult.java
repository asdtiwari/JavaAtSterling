/* Write a program to enter marks of five subjects and calculate total, average and percentage. */

public class PrintResult {
	public static void main(String[] args) {

		double maxMarks = 60;

		double mathsMarks = 58;
		double englishMarks = 55;
		double hindiMarks = 50;
		double socialStudiesMarks = 35;
		double generalScienceMarks = 55;

		double totalMarks = mathsMarks + englishMarks + hindiMarks + socialStudiesMarks + generalScienceMarks;
		double average = totalMarks / (maxMarks * 5);
		double percentage = average * 100;

		System.out.println(
"Result \n" +
"Max Marks: " + maxMarks + "\n" +
"Maths: " + mathsMarks + "\n" + 
"English: " + englishMarks + "\n" + 
"Hindi: " + hindiMarks + "\n" + 
"Social Science: " + socialStudiesMarks + "\n" + 
"General Science: " + generalScienceMarks + "\n" +
"Total: " + totalMarks + "\n" +
"Average: " + average + "\n" +
"Percentage: " + percentage);
	}
}