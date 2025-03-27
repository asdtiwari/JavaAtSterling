/* Write a program to enter length in centimetre and convert it into meter and kilometre */

public class CentimeterToMeterAndKiloMeter {
	public static void main(String[] args) {
		int centiMeter = 10;
		System.out.println(
"Centimeter is " + centiMeter + "\n" + 
"Meter is " + (centiMeter * 100) + "\n" +
"KiloMeter is " + (centiMeter * 1000));
	}
}