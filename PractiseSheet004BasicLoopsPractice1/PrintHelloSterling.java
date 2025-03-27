/* 2. Write a program to print “Hello” and then print your name on a separate 
line five times. 
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
Sterling Institute  */

public class PrintHelloSterling {
	public static void main(String[] args) {
		int times = 5;
		while(times > 0) {
			System.out.println("Hello\nSterling Institute");
			--times;
		}
	}
}
