/* Write a program to convert days into years, weeks and days */

public class DaysIntoYearsWeeksAndDays {
	public static void main(String[] args) {
		int days = 400;
		System.out.println(
"Given Days " + days + "\n" +
"Years " + (days / 365) + "\n" +
"Weeks " + (days / 7) + "\n" +
"Days " + days);
	}
}