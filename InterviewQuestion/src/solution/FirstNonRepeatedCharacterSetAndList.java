package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacterSetAndList {
	public static char findTheFirstNonRepeatingCharSetAndList(String word) {
		Set<Character> repeated = new HashSet<Character>();
		List<Character> nonRepeated = new ArrayList<Character>();

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (repeated.contains(letter))
				continue;
			if (nonRepeated.contains(letter)) {
				nonRepeated.remove((Character) letter);
				repeated.add(letter);
			} else {
				nonRepeated.add(letter);
			}

		}

		return nonRepeated.get(0);

	}

	public static char findTheFirstNonRepeatingLetterUsingMap(String word) {
		Map<Character, Integer> nonRepeatedLetters = new HashMap<Character, Integer>();
		char[] letters = word.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			char value = letters[i];
			nonRepeatedLetters.put(value,
					nonRepeatedLetters.containsKey(value) ? nonRepeatedLetters.get(value) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : nonRepeatedLetters.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		throw new RuntimeException("didn't find any non repeated Character");

	}
}