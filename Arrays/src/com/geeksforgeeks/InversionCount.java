package com.geeksforgeeks;

public class InversionCount {

	static long inversionCount(long arr[], long N) {

		int count = 0;
		if (N == 1)
			return 0;

		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++)
				if (arr[i] > arr[j])
					count++;

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = { 468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392,
				105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312,
				323 };
		System.out.println(inversionCount(arr, arr.length));

	}

}
