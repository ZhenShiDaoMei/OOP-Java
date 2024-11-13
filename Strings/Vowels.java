//Jason Wu 114474379
package jason;

public class Vowels {
	// Your task is to count the number of vowels in a string.
	public static void main(String[] args) {
		System.out.println(countNumVowels("Stony Brook University"));
		System.out.println(countNumVowels("The quick brown fox jumped over the lazy dog"));
	}

	public static int countNumVowels(String str) {
		return str.replaceAll("[^aeiouAEIOU]", "").length();
	}
}
