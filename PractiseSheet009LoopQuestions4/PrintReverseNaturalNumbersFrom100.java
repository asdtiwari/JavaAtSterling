//Write a program to print all natural numbers in reverse (from 100 to 1). 
public class PrintReverseNaturalNumbersFrom100 {
	public static void main(String[] args) {
		int i = 100;
		while(i >= 1) {
			System.out.print(i + " ");
			--i;
		}
		System.out.println();
	}
}