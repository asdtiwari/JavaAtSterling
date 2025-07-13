// A basic calculator application using the cmd line menu concepts and all previous concepts
public class CalculatorApp {
	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println("\n" + "---- Basic Calculator ----");
			
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Quotient");
			System.out.println("Press 5 for Remainder");
			System.out.println("Press 6 for Exit");
			
			System.out.print("Enter you choice: ");
			int choice = '\n';
			while(true) {
				choice = System.in.read();
				if(choice >= '0') {
					if(choice <= '9') {
						break;
					}
				}
			}
			choice = choice - '0';
			
			if(choice == 1) {
				Addition.main(new String[0]);
			} else if(choice == 2) {
				Subtraction.main(new String[0]);
			} else if(choice == 3) {
				Multiplication.main(new String[0]);
			} else if(choice == 4) {
				Quotient.main(new String[0]);
			} else if(choice == 5) {
				Remainder.main(new String[0]);
			} else if(choice == 6) {
				System.out.println("Good Bye, please visit again \n");
				break;
			} else {
				System.out.println("!!! Invalid Choice \n Try Again... \n");
			}
			
		}
	}
}