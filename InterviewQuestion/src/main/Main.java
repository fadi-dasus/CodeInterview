package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import solution.AnagramCheck;
import solution.DuplicatedCharacter;
import solution.FirstNonRepeatedCharacterSetAndList;
import solution.Permutation;
import solution.RandomStuff;
import solution.RegularExpressionExample;
import solution.StringReverseExample;
import solution.TextReverse;
import solution.VowelCounter;
import sun.security.util.Length;

//

public class Main {
	public static void main(String args[]) {

		int[] test = new int[] { 1, 2, 3, 4, 4, 5, 5 };
		System.out.println(AnagramCheck.areAnagrams("Mary", "Myar"));
		System.out.println(FirstNonRepeatedCharacterSetAndList.findTheFirstNonRepeatingLetterUsingMap("fffffadi"));
		StringReverseExample.reverseString("Sony is going to introduce Internet TV soon");
		RegularExpressionExample.checkIfStringContainingIntegers();
		VowelCounter.countNumberOfVowelsInAString("fadi dasus");
		Permutation.permutation("ABC");
		System.out.println(TextReverse.reverseSentence("I am a Java developer"));
		RandomStuff.sum(test, 8);

		System.out.println("Array with Duplicates       : " + Arrays.toString(test));
		System.out.println("After removing duplicates   : " + Arrays.toString(RandomStuff.removeDuplicates(test)));
		Pattern pattern = Pattern.compile(",");
		Collection<String> numbers = Arrays.asList("1235,1455", "656651", "4444,444,44,44,");
		List<String> valids = numbers.stream().filter(pattern.asPredicate()).collect(Collectors.toList());
		valids.forEach(System.out::println);

	}

}
