// Your college Grading System program using ladder if else & nested if-else
// 90 - 100 : O, 80 - 89 : A+, 70 - 79 : A, 60 - 69 : B+, 50 - 59 : B, 40 - 49 : C, 30 - 39 : P, 28 - 29 : P(G), <= 29 : F 

public class GradingSystemUsingNestedIfElse {
	public static void main(String[] args) {
		int marks = 55;
		if(marks > 0) {
			if(marks >= 29) {
				if(marks >= 30) {
					if(marks >= 40) {
						if(marks >= 50) {
							if(marks >= 60) {
								if(marks >= 70) {
									if(marks >= 80) {
										if(marks >= 90) {
											System.out.println("O");
										}
										else {
											System.out.println("A+");
										}
									}
									else {
										System.out.println("A");
									}
								}
								else {
									System.out.println("B+");
								}
							}
							else {
								System.out.println("B");
							}
						}
						else {
							System.out.println("C");
						}
					}
					else {
						System.out.println("P");
					}
				}
				else {
					System.out.println("P(G)");
				}
			}
			else {
				System.out.println("F");
			}
		}
	}
}
