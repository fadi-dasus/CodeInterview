package solution;

public class VowelCounter {
	public static void countNumberOfVowelsInAString(String input) {
		char[] letters = input.toCharArray();

		int count = 0;

		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				// no count increment
			}

		}
		System.out.println("Number of vowels in String [" + input + "] is : " + count);

	}

}
