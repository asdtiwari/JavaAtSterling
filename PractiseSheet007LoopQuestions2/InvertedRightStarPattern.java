/* WAP to print inverted right triangle star pattern
* * * * *
  * * * *
    * * *
      * *
        *
*/
public class InvertedRightStarPattern {
	public static void main(String[] args) {
		int row = 1;
		int end = 5;
		while(row <= end) {
			int col = 1;
			while(col <= end) {
				if(col >= row) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				++col;
			}
			System.out.println();
			++row;
		}
	}
}