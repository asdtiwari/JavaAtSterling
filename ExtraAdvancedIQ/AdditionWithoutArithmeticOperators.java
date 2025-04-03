// WAP to do addition of two number without using any operator 

public class AdditionWithoutArithmeticOperators {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int ans = 0;

		int carry = 0;
		int append = 1;
		while(num1 > 0 || num2 > 0 || carry > 0) {
			int a = num1 & 1;
			int b = num2 & 1;
			if(carry == 1 && a == 1 && b == 1) {
				ans = append | ans;
				carry = 1;
			}
			else if((carry == 1 && a == 1) || (carry == 1 && b == 1) || (a == 1 && b == 1)) {
				carry = 1;
			}
			else if(carry == 1 || a == 1 || b == 1){
				ans = append | ans;
				carry = 0;
			}
			else {
				carry = 0;
			}
			num1 >>= 1;
			num2 >>= 1;
			append <<= 1;
		}
		System.out.println(ans);
	}
}