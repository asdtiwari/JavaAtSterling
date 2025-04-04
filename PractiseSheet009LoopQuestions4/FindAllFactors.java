// Write a program to find all factors of a number. 
public class FindAllFactors {
	public static void main(String[] args) {
		int num = 1024;
		for(int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}