//Jason Wu 114474379
package jason.Strings;

public class Consonants {
	// Your task is to count the number of consonants in a string.
	public static void main(String[] args) {
		System.out.println(countConsonants("Stony Brook University"));
		System.out.println(countConsonants("The quick brown fox jumped over the lazy dog"));
	}

	public static int countConsonants(String str) {
		String letters = str.replaceAll("[^a-zA-Z]", "");
		return letters.length() - letters.replaceAll("[^aeiouAEIOU]", "").length();
	}
}
