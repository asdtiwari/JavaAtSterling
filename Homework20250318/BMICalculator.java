/* BMI Calculator 
BMI Categories:
1. Underweight: BMI less than 18.5
2. Normal weight: BMI between 18.5 and 24.9
3. Overweight: BMI between 25 and 29.9
4. Obese: BMI of 30 or greater
5. Obesity Classes:
	a. Class I: 30.0 to 34.9
	b. Class II: 35.0 to 39.9
	c. Class III: 40.0 or greater 
BMI = weight / (height * height) */

public class BMICalculator {
	public static void main(String[] args) {

		double height = 1.55448; // meter
		double weight = 65; // kg
		double BMI = weight / (height * height);
		if(BMI < 18.5) {
			System.out.println("Underweight");
		}
		else if(BMI < 25) {
			System.out.println("Normal Weight");
		}
		else if(BMI < 30) {
			System.out.println("Overweight");
		}
		else if(BMI < 35) {
			System.out.println("Class I Obesity");
		}
		else if(BMI < 40) {
			System.out.println("Class II Obesity");
		}
		else {
			System.out.println("Class III Obesity");
		}
	}
}