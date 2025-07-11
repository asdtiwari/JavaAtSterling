// WAP to check whether the given year using CLI is leap year or not
public class LeapYearOrNot {
	public static void main(String[] args) {
		if(args.length > 0) {
			for(String word : args) {
				for(int i = 0, len = word.length(); i < len; ++i) {
					if(word.charAt(i) < '0'|| word.charAt(i) > '9') {
						System.out.println("Enter digits only!!!");
						return;
					}
				}
			}
			for(String word : args) {
				int year = Integer.parseInt(word);
				if(year % 400 == 0) {
					System.out.println(year + " is leap year");
				} else if(year % 100 == 0) {
					System.out.println(year + " is not leap year");
				} else if(year % 4 == 0) {
					System.out.println(year + " is leap year");
				} else {
					System.out.println(year + " is not leap year");
				}
			}
		} else {
			System.out.println("Re-execute the program and pass the integer value in CLI.");
		}
	}
}