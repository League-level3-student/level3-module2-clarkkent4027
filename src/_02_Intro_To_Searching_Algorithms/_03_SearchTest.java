package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest 

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String [] Colors = {"cyan","indigo", "magenta", "yellow", "pink"};
    	
        assertEquals(3, _01_LinearSearch.linearSearch(Colors, "yellow"));
        assertEquals(-1, _01_LinearSearch.linearSearch(Colors, "red"));
        
        
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int [] values = {144, 169, 196, 225, 256, 289, 324, 361, 400};
       
    }
}
