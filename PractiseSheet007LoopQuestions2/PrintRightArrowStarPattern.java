/* Write a program to print Right Arrow Star Pattern? 
*  *  *  *  * 
      *  *  *  * 
  	   *  *  * 
         	*  * 
              	    * 
        	*  * 
           *  *  * 
      *  *  *  * 
*  *  *  *  *
*/
public class PrintRightArrowStarPattern {
	public static void main(String[] args) {
		int n = 10;
		
		int from = 0;
	 	int to = 2 * n;

		int row = 1;
		while(row < 2 * n) {
			int col = 1;
			while(col < 3 * n - 1) {
				if(col > from) {
					if(col < to) {
						if(row % 2 == 0) {
							if(col % 2 == 0 ) {
								System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
						else {
							if(col % 2 != 0) {
								System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
			
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					System.out.print(" ");
				}
				++col;
			}

			System.out.println();
			if(row < n) {
				from += 3;
				++to;
			}
			else {
				from -= 3;
				--to;
			}
			++row;
		}
	}
}