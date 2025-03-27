/* 3. Write a program to print “Hello” and then print your name five times.  
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
Continue this loop for five times. */

public class PrintHelloSterlingInstitute5Times {
	public static void main(String[] args) {
		int i = 5;
		while(i > 0) {
			System.out.println("Hello");
			int j = 0;
			while(j < 5) {
				System.out.println("Sterling Institute");
				++j;
			}
			--i;
		}
	}
}