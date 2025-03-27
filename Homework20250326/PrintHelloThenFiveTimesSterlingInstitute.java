/* Write a program to print “Hello” and then print your name five times.  
Expected Output: 
Hello 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Hello 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Continue this loop for five times.
*/
public class PrintHelloThenFiveTimesSterlingInstitute {
	public static void main(String[] args) {
		int end = 5;
		for(int loop = 0; loop < 5; ++loop) {
			System.out.println("Hello \nSterling Institute \nSterling Institute \nSterling Institute \nSterling Institute \nSterling Institute");
		}
	}
}