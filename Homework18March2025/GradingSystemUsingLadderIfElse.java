// Your college Grading System program using ladder if else & nested if-else
// 90 - 100 : O, 80 - 89 : A+, 70 - 79 : A, 60 - 69 : B+, 50 - 59 : B, 40 - 49 : C, 30 - 39 : P, 28 - 29 : P(G), <= 29 : F 

public class GradingSystemUsingLadderIfElse {
	public static void main(String[] args) {
		int marks = 55;
		if(marks >= 90) {
			System.out.println("O");
		}
		else if(marks >= 80) {
			System.out.println("A+");
		}
		else if(marks >= 70) {
			System.out.println("A");
		}
		else if(marks >= 60) {
			System.out.println("B+");
		}
		else if(marks >= 50) {
			System.out.println("B");
		}
		else if(marks >= 40) {
			System.out.println("C");
		}
		else if(marks >= 30) {
			System.out.println("P");
		}
		else if(marks >= 28) {
			System.out.println("P(G)");
		}
		else {
			System.out.println("F");
		}
	}
}