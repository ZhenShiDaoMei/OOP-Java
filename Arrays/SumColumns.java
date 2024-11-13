//Jason Wu 114474379
package jason;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the dimensions of an n x m matrix");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] matrix = new double[rows][columns];
		input.nextLine();
		System.out.print("Enter the matrix elements, row by row, seperated by spaces.");
		for (int i = 0; i < rows; i++) {
			String input1 = input.nextLine();
			String[] inputAsArray = input1.split(" ");
			for (int j = 0; j < columns && j < inputAsArray.length; j++) {
				if (!inputAsArray[j].equals(""))
					matrix[i][j] = Double.parseDouble(inputAsArray[j]);

			}
		}
		double[] sums = sumColumns(matrix);
		System.out.println("The sums of the columns are: ");
		System.out.println(Arrays.toString(sums));
		input.close();
	}

	public static double[] sumColumns(double[][] matrix) {
		double[] sums = new double[matrix[0].length];
		for (int j = 0; j < matrix[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}
			sums[j] = sum;
		}
		return sums;
	}
}
