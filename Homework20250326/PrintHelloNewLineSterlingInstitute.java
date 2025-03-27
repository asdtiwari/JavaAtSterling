/* Write a program to print “Hello” and then print your name on a separate line five times. 
Expected Output: 
Hello 
Sterling Institute 
Hello  
Sterling Institute 
Hello  
Sterling Institute 
Hello  
Sterling Institute 
Hello  
Sterling Institute
*/
public class PrintHelloNewLineSterlingInstitute {
	public static void main(String[] args) {
		int end = 5;
		for(int loop = 0; loop < end; ++loop) {
			System.out.println("Hello\nSterling Institute");
		}
	}
}