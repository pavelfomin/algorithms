package com.pvlf;

import java.util.Arrays;

/**
 * Median calculation of two sorted arrays.
 * Based on http://www.geeksforgeeks.org/median-of-two-sorted-arrays/.
 */
public class Median {

	/**
	 * Returns median of two sorted arrays of the same size.
	 * @param array1
	 * @param array2
	 * @param n
	 * @return median
	 */
	public float getMedian(int array1[], int array2[], int n) {

		if (n == 1)
			return (float) (array1[0] + array2[0]) / 2;

		if (n == 2)
			return (float) (Math.max(array1[0], array2[0]) + Math.min(array1[1], array2[1])) / 2;

		float median1 = median(array1, n);
		float median2 = median(array2, n);

		if (median1 == median2)
			return median1;

		// if m1 < m2 then median must exist in array1[m1..n] and array2[0..m2]
		if (median1 < median2) {
			if (n % 2 == 0)
				return getMedian(Arrays.copyOfRange(array1, n / 2 - 1, n), array2, n - n / 2 + 1);
			return getMedian(Arrays.copyOfRange(array1, n / 2, n), array2, n - n / 2);
		}

		// if m1 > m2 then median must exist in array1[0..m1] and array2[m2..n]
		if (n % 2 == 0)
			return getMedian(Arrays.copyOfRange(array2, n / 2 - 1, n), array1, n - n / 2 + 1);
		return getMedian(Arrays.copyOfRange(array2, n / 2, n), array1, n - n / 2);
	}

	/**
	 * Get median of a sorted array.
	 * 
	 * @param array
	 * @param n
	 * @return median
	 */
	private float median(int array[], int n) {

		if (n % 2 == 0)
			return (float) (array[n / 2] + array[n / 2 - 1]) / 2;
		else
			return array[n / 2];
	}

}
