package jason.Arrays;

public class ArrayUtils {
	public static void main(String[] args) {
		int[] array = randomArray(100, 21);
		print(array);
		arraySum(array);
		contains(array, 12);
		countMultiplesOf(array, 7);
	}

	// a
	public static int[] randomArray(int nums1, int nums2) {
		int[] myList = new int[nums1];
		for (int i = 0; i < nums1; i++) {
			myList[i] = (int) (Math.random() * nums2);
		}
		return myList;
	}

	// b
	public static void print(int[] myList) {
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}

	}

	// c
	public static void arraySum(int[] myList) {
		int total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println(total);
	}

	// d
	public static void contains(int[] myList, int single) {
		int lookingfor = single;
		int confirm = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] == lookingfor) {
				confirm = 1;
				System.out.println("WE FOUND YOUR NUMBER");
				System.out.println(lookingfor + " is found on the " + i + "th index of the array.");
				break;
			}
		}
		if (confirm != 1) {
			System.out.println("WE DID NOT FIND YOUR NUMBER");
			System.out.println("-1");
		}
	}

	// e
	public static void countMultiplesOf(int[] myList, int multiplier) {
		int multiplierof = multiplier;
		int remainder, count;
		count = 0;
		for (int i = 0; i < myList.length; i++) {
			remainder = myList[i] % multiplierof;
			if (remainder == 0) {
				count += 1;
			}

		}
		System.out.println(count + " integers in the array are multiples of " + multiplierof + ".");
	}

}
