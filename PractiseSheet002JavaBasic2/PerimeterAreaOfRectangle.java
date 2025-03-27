/* Write a program to enter length and breadth of a rectangle and find preimeter and area. */
public class PerimeterAreaOfRectangle {
	public static void main(String[] args) {
		int len = 10;
		int breadth = 20;
		System.out.println(
"Perimeter of Rectangle (" + len + "," + breadth + ") is " + (2 * (len + breadth)) + "\n" +
"Area of Rectangle (" + len + "," + breadth + ") is " + (len * breadth));
	}
}