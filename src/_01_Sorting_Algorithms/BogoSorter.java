package _01_Sorting_Algorithms;

import java.util.Random;

import _00_Intro_to_Sorting_Algorithms._01_SortedArrayChecker;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		while (_01_SortedArrayChecker.intArraySorted(array) == false) {
			swapElements(array);
			display.updateDisplay();
		}

	}

	void swapElements(int[] array) {
		Random r = new Random();
		int e = r.nextInt(array.length);
		int d = r.nextInt(array.length);
		int temp = array[e];
		array[e] = array[d];
		array[d] = temp;

	}
}
