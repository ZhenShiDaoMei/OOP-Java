package jason.Review;

import java.util.*;

public class FinalReview {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("what do you want?: ");
			String wants = input.nextLine();
			System.out.println(wants);
		}
	}

	// Teddy bear recursion
	public static boolean bears(int initial, int goal, int increment, int n) {
		if (initial == goal) {
			return true;
		} else if (n == 0) {
			return false;
		} else if (bears(initial + increment, goal, increment, n - 1)) {
			return true;
		} else if ((initial % 2 == 0) && bears(initial / 2, goal, increment, n - 1)) {
			return true;
		} else {
			return false;
		}
	}

	// series recursion
	public static double Series(int i) {
		double total = 0;
		return Series(i, total);
	}

	public static double Series(int i, double total) {
		if (i == 1) {
			total += 1;
			return total;
		}
		total += 1.0 / i;
		return Series(i - 1, total);
	}

	// McCarthy's 91 function recursion
	public static int McCarthy(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return McCarthy(McCarthy(n + 11));
		}
	}

	// Ackermann function recursion
	/*
	 * A(0, n) = n + 1 for all nonnegative integers n
	 * A(m, 0) = A(m - 1, 1)�� for all positive integers m
	 * A(m, n) = A(m - 1, A(m, n - 1)) for all positive integers m and n
	 */
	public static int Ackermann(int m, int n) {
		if (m == 0)
			return n + 1;
		if (n == 0)
			return Ackermann(m - 1, 1);
		return Ackermann(m - 1, Ackermann(m, n - 1));
	}

	// tartan recursion
	public static void tartan(int n) {
		tartan(1, n);
	}

	public static void tartan(int i, int n) {
		if (i == n + 1) {
			return;
		}
		tartan(i, 1, n);
		tartan(i + 1, n);
	}

	public static void tartan(int i, int j, int n) {
		if (j > n) {
			System.out.println();
			return;
		}
		System.out.print(((i + j) % 2 == 0 ? n : n - 1) + " ");
		tartan(i, j + 1, n);
	}

	/*
	 * permutations of an ArrayList recursion
	 * public static ArrayList<ArrayList<Object>> permutations(ArrayList<Object> a)
	 * {
	 * ArrayList<ArrayList<Object>> perms = new ArrayList<ArrayList<Object>>();
	 * if(a.isEmpty()){
	 * ArrayList<Object> onePerm = new ArrayList<Object>();
	 * perms.add(onePerm);
	 * return perms;
	 * }
	 * for(Object oneElem:a){
	 * // take an element from the list
	 * ArrayList<Object> b = (ArrayList<Object>)(a.clone());
	 * b.remove(oneElem);
	 * // construct all permutations of the list without that element
	 * ArrayList<ArrayList<Object>> perms2 = permutations(b);
	 * // add the element that you took out back to the list
	 * for(ArrayList<Object> onePerm:perms2){
	 * onePerm.add(oneElem);
	 * perms.add(onePerm);
	 * }
	 * }
	 * return perms;
	 * }
	 */
	// reverse array recursion
	public static int[] reverse(int[] array) {
		return reverse(array, 0, array.length - 1);
	}

	public static int[] reverse(int[] array, int low, int high) {
		int temp;
		if (high <= low)
			return array;
		temp = array[high];
		array[high] = array[low];
		array[low] = temp;
		return reverse(array, low + 1, high - 1);
	}

	// palindrome recursion
	public static boolean isPalindrome(int[] array) {
		return isPalindrome(array, 0, array.length - 1);
	}

	public static boolean isPalindrome(int[] array, int low, int high) {
		if (high <= low)
			return true;
		if (array[low] != array[high])
			return false;
		return isPalindrome(array, low + 1, high - 1);
	}

	// compress recursion
	public static ArrayList<Integer> compress(int[] array) {
		ArrayList<Integer> b = new ArrayList<>();
		compress(array, b, 0);
		return b;
	}

	public static void compress(int[] array, ArrayList<Integer> b, int pos) {
		if (pos == array.length - 1) {
			b.add(array[pos]);
			return;
		}
		if (array[pos] != array[pos + 1])
			b.add(array[pos]);
		compress(array, b, pos + 1);
	}

}
