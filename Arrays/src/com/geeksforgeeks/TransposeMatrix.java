package com.geeksforgeeks;

import java.util.Arrays;

public class TransposeMatrix {

	public static int[][] transpose(int[][] matrix) {

		int[][] result = new int[matrix[0].length][matrix.length];
		int n = matrix.length;
		int m = matrix[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[j][i] = matrix[i][j];
			}
		}

		return result;

	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] i : transpose(matrix))
			System.out.println(Arrays.toString(i));

	}

}
