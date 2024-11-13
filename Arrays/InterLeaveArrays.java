package jason.Arrays;

import java.util.Arrays;

public class InterLeaveArrays {

	public static void main(String[] args) {
		int[] array21 = interleaveArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 });
		System.out.println(Arrays.toString(array21));
	}

	@SuppressWarnings("unlikely-arg-type")
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] newarray = new int[(array1.length + array2.length)];
		int length1 = array1.length;
		int length2 = array2.length;
		for (int i = 0; i < length1; i++) {
			if (Arrays.asList(newarray).contains(array1[i]) == false) {
				newarray[0 + (2 * i)] = array1[i];
			}
		}
		for (int j = 0; j < length2; j++) {
			if (Arrays.asList(newarray).contains(array2[j]) == false) {
				newarray[1 + (2 * j)] = array2[j];
			}
		}
		return newarray;
	}
}
