/* 1. Write a program to print your name five times on console. 
Expected Output: 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute 
Sterling Institute */

public class PrintSterlingInstitute {
	public static void main(String[] args) {
		int times = 5;
		while(times > 0) {
			System.out.println("Sterling Institute");
			--times;
		}
	}
}