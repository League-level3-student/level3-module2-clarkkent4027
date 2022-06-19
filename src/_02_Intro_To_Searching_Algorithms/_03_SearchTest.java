package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

	/*
	 * A minimum of 3 tests are required for each method
	 */

	@Test
	public void testLinearSearch() {
		// 1. Use the assertEquals() method to test your linear search method
		String[] colors = {"cyan", "indigo", "magenta", "yellow", "pink"};

		assertEquals(3, _01_LinearSearch.linearSearch(colors, "yellow"));
		assertEquals(-1, _01_LinearSearch.linearSearch(colors, "red"));
		assertEquals(1, _01_LinearSearch.linearSearch(colors, "indigo"));
	}

	@Test
	public void testBinarySearch() {
		// 2. Use the assertEquals() method to test your binary search method
		// remember that the array must be sorted
		int[] values = {144, 169, 196, 225, 256, 289, 324, 361, 400};

		assertEquals(3, _02_BinarySearch.binarySearch(values, 0, values.length-1, 225));
		assertEquals(-1, _02_BinarySearch.binarySearch(values, 0, values.length-1, 334));
	}
}
