/* Write a program to create a One D Array and insert Random numbers */
import java.util.Random;
public class RandomNumberInTwoDArray {
	public static void main(String[] args) {
		if(args.length > 0) {
			Random r = new Random();

			int rowSize = Integer.parseInt(args[0]);
			int colSize = Integer.parseInt(args[1]);
			int[][] twoDArr = new int[rowSize][colSize];
			int seed = rowSize * colSize * 100;
			for(int i = 0; i < twoDArr.length; ++i) {
				for(int j = 0; j < twoDArr[0].length; ++j) {
					twoDArr[i][j] = r.nextInt(seed);
				}
			}

			System.out.println("2D Array of size [" +  rowSize + "][" + colSize + "] with random elements:");
			for(int[] oneDArr : twoDArr) {
				for(int num : oneDArr) {
					System.out.print(num + "\t ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Pass the size of row and column of 2D array at command line args");
		}
	}
}