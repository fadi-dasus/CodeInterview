package solution;

import java.util.Arrays;

public class AnagramCheck {
	public static boolean areAnagrams(String first, String second) {
		return areAnagramsByCompainringTheCharArray(first, second)
				& areAnagramsByCheckingCharactersInBothStrings(first, second);
	}

	private static boolean areAnagramsByCompainringTheCharArray(String first, String second) {
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray, secondArray);

	}

	private static boolean areAnagramsByCheckingCharactersInBothStrings(String first, String second) {
		char[] firstArray = first.toCharArray();
		StringBuffer secondBuffer = new StringBuffer(second);
		for (char c : firstArray) {
			int index = secondBuffer.indexOf("" + c);
			if (index != -1)
				secondBuffer.deleteCharAt(index);
		}
		if (secondBuffer.length() > 0)

			return false;

		else {
			return true;
		}
	}

}
