//Jason Wu 114474379
package jason;

public class Syllables {
	// Your task is to count the number of syllables in a string. A syllable
	// contains one or two vowels sequentially. Print the syllables one per row.
	public static void main(String[] args) {
		System.out.println(countSyllables("aeiou2aeiou2ae2i2ou"));
	}

	public static int countSyllables(String str) {
		int count = 0;
		boolean prevVowel = false;
		for (int i = 0; i < str.length(); i++) {
			// Encountered a vowel
			if ("aeiouAEIOU".indexOf(str.charAt(i)) != -1) {
				// If vowels are consecutive
				if (prevVowel) {
					System.out.println(str.substring(i - 1, i + 1));
					prevVowel = false;
					count++;
				} else {
					prevVowel = true;
				}
			} else {
				if (prevVowel) {
					System.out.println(str.charAt(i - 1));
					prevVowel = false;
					count++;
				}
			}
		}
		if (prevVowel) {
			System.out.println(str.charAt(str.length() - 1));
			count++;
		}
		return count;
	}
}
