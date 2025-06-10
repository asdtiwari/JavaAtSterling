// find out the length of string without using any string handling method
// use chatgpt and prompt: how to get the information related to object in java
// directly chatgpt didn't provide anything.

import java.lang.reflect.Field;
import java.util.Arrays;
public class LengthOfStringWithoutUsingAnyStringHandlingMethod {
	public static void main(String[] args) {
		try{
			String str = "Akhilesh";

			Class<?> cls = str.getClass();

			Field[] fields = cls.getDeclaredFields();

			fields[0].setAccessible(true);
			Object value = fields[0].get(str);

			char[] arr = (char[])value;

			System.out.println("Length of String is: " + arr.length);
			System.out.println("Length of Arrays.toString(arr));

		}catch(Exception ex) {
			System.out.println("exception");
		}
	}
}