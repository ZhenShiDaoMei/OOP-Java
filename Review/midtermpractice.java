package jason.Review;

public class midtermpractice {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };
		rotateRight(nums, 3);
	}

	public static void rotateRight(int[] nums, int n) {
		int length = nums.length;
		System.out.print(length);
		for (int i = 0; i < n; i++) {
			// shift by 1 to the right
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--)
				nums[j] = nums[j - 1];
			nums[0] = temp;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(nums[i]);
		}

	}

}
