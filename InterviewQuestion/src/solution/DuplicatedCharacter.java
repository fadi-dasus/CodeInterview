package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatedCharacter {
	public static void findDuplicatedCharactersIfAny(String word) {
		if (word == null || word.isEmpty() == true)
			throw new RuntimeException(
					"pleaes make sure that the string you have entered is a valid string and it is not empty");

		Map<Character, Integer> charactersMap = new HashMap<>(word.length());
		char[] characterArray = word.toCharArray();
		for (char c : characterArray) {
			charactersMap.put(c, charactersMap.containsKey(c) ? charactersMap.get(c) + 1 : 1);
		}

		for (Entry<Character, Integer> entry : charactersMap.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.toString());
		}

	
	}

	}
