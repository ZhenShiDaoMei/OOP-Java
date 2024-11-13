//Jason Wu 114474379
/*
 * EliminateDuplicates.java: Write a method 
public static String eliminateDuplicates(String str) 
that returns a copy of the argument str after eliminating all duplicate characters. The first occurrence of each character must be kept
and the characters must stay in order relative to the other letter sin the string. For example, if str is �bzzaaf� then the return value 
should be �bzaf� and not something else like �abfz� or �zfba�. The str parameter can contain any printable ASCII characters or spaces, but
not tabs or newlines.Include in your program the test cases listed below and add at least 2 more. Example test cases:
eliminateDuplicates("abracadabra") returns abrcd
eliminateDuplicates("Stony Brook University") returns Stony BrkUives
eliminateDuplicates("This is a test sentence.") returns This atenc.
 */
package jason.Strings;
import java.util.Scanner;
import java.util.Arrays;
public class EliminateDuplicates {
	public static void main(String[] args) {
		System.out.print("Give me a string: ");
		try (Scanner input1 = new Scanner(System.in)) {
			String S1 = input1.nextLine();
			
			String[] myList = new String[S1.length()];
			for (int i = 0; i < S1.length(); i++) {
				String STR1 = String.valueOf(S1.charAt(i));
				if (Arrays.asList(myList).contains(STR1) == true) {
					myList[i] = null;
				}
				else {myList[i] = STR1;}
				}
			for (int j = 0; j < S1.length(); j++) {
				if(myList[j] != null) {
				System.out.print(myList[j]);}
				else {System.out.print("");}
			}
		}
	}
}



