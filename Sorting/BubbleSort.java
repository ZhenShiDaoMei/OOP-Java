//Jason Wu 114474379
package jason.Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		double[] nums = { 6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5 };
		BubbleSorting(nums);
		System.out.println("Final sorted array: ");
		System.out.println(Arrays.toString(nums));
	}

	public static void BubbleSorting(double[] nums) {
		boolean changed;
		do {
			changed = false;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					swap(nums, i, i + 1);
					changed = true;
				}
			}
		} while (changed);
	}

	public static void swap(double[] nums, int index1, int index2) {
		double temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
