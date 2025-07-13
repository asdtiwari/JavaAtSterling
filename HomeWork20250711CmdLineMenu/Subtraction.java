// To subtract the numbers
public class Subtraction {
	public static void main(String[] args) throws Exception {
		System.out.println("\n" + "*** Subtraction of Numbers ***");

		System.out.print("Enter two integers: ");
		int[] num = {0, 0};
		for(int i = 0; i < 2; ++i) {		
			int temp = 0;
			int ch = 0;
			while(true) {
				ch = System.in.read();
				if(ch >= '0') {
					if(ch <= '9') {
						break;
					}
				}
			}
			while(true) {
				if(ch >= '0') {
					if(ch <= '9') {
						temp = temp * 10;
						temp = temp + (ch - '0');
					} else {
						break;
					}
				} else {
					break;
				}
				ch = System.in.read();
			}
			num[i] = temp;
		}

		System.out.println(num[0] + " - " + num[1] + " = " + (num[0] - num[1]) + "\n");
	}
}