// voting result conditional statement program
public class ElectionResult {
	public static void main(String[] args) {
		int bjpVotes = 20000;
		int congressVotes = 10000;
		if(bjpVotes > congressVotes) {
			System.out.println("BJP won the election");
		} else {
			System.out.println("Congress won the election");
		}
	}
}