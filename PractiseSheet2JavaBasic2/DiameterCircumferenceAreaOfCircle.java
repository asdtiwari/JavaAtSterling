/* Write a program to enter radius of a circle and find its diameter, circumference and area. */

public class DiameterCircumferenceAreaOfCircle {
	public static void main(String[] args) {
		float radius = 7;
		float PI = 3.14f;
		System.out.println(
"Radius of circle " + radius + "\n" +
"Circumference of circle " + (2 * PI * radius) + "\n" +
"Area of circle " + (PI * radius * radius));
	}
}