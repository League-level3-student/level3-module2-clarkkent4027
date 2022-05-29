package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
					return false;
				}
			}

		}
		return true;
	}

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	public static boolean doubleArraySorted(double[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2.length - 1; k++) {
				if (arr2[k] > arr2[k + 1]) {
					double temp = arr2[k];
					arr2[k] = arr2[k + 1];
					arr2[k + 1] = temp;
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */
	public static boolean charArraySorted(char[] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			for (int k = 0; k < arr3.length - 1; k++) {
				if (arr3[k] > arr3[k + 1]) {
					int temp = arr3[k];
					arr3[k] = arr3[k + 1];
					temp = arr3[k + 1];
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */
	public static boolean stringArraySorted(String[] arr4) {
		for (int i = 0; i < arr4.length; i++) {
            for (int k = 0; k < arr4.length - 1; k++) {
                if( arr4[k].compareTo(arr4[ k+1 ]) > 0 ) {
                    String temp = arr4[k];
                    arr4[k] = arr4[ k+1 ];
                    arr4[ k+1 ] = temp;
                    return false;
                }
            }
        }
	return true;
}
}
