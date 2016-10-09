package com.pvlf;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianTest {

	private Median median = new Median();
	
	@Test
	public void median() {
		
		int[] array1;
		int[] array2;

	    array1 = new int[] {1};
	    array2 = new int[] {4};
	    assertEquals(2.5, median.getMedian(array1, array2, array1.length), 0.1);

	    array1 = new int[] {1, 2};
	    array2 = new int[] {4, 6};
	    assertEquals(3, median.getMedian(array1, array2, array1.length), 0.1);
	    
	    array1 = new int[] {11, 12, 12};
	    array2 = new int[] {4, 6, 8};
	    assertEquals(9.5, median.getMedian(array1, array2, array1.length), 0.1);
	    
	    array1 = new int[] {1, 2, 3, 6};
	    array2 = new int[] {4, 6, 8, 10};
	    assertEquals(5, median.getMedian(array1, array2, array1.length), 0.1);
	    
		array1 = new int[] {1, 2, 3, 4, 5};
		array2 = new int[] {6, 7, 8, 9, 10};
		assertEquals(5.5, median.getMedian(array1, array2, array1.length), 0.1);
		
		array1 = new int[] {1, 2, 3, 4, 5};
		array2 = new int[] {10, 11, 12, 13, 14};
		assertEquals(7.5, median.getMedian(array1, array2, array1.length), 0.1);
		
		array1 = new int[] {1, 12, 15, 26, 38};
		array2 = new int[] {2, 13, 17, 30, 45};
		assertEquals(16, median.getMedian(array1, array2, array1.length), 0.1);
	}

}
