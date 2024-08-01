package com.geeksforgeeks;

import java.util.Arrays;

public class MultiplyMatrices {

	public static void multiply(int A[][], int B[][], int C[][], int N) {
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				for (int k = 0; k < N; k++)
					C[i][j] += A[i][k] * B[k][j];

		for (int[] i : C) {
			System.out.println(Arrays.toString(i));
		}
	}

	public static void main(String[] args) {

		int A[][] = { { 7, 8 }, { 2, 9 } };
		int B[][] = { { 14, 5 }, { 5, 18 } };
		int N = A.length;
		int C[][] = new int[N][N];
		multiply(A, B, C, N);

	}

}
