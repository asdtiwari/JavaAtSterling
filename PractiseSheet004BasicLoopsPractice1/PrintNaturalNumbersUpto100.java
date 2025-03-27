/* 5. Write a program to print all natural numbers from 1 to 100. 
Expected Output: 
1 
2 
3 
. 
. 
. 
100 */

public class PrintNaturalNumbersUpto100 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100) {
			System.out.println(i);
			++i;
		}
	}
}