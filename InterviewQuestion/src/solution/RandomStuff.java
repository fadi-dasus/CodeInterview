package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomStuff {
	public static void sum(int[] numbers, int sum) {
		List<Integer> mylist = new ArrayList<>();
		for (int value : numbers) {
			int target = sum - value;
			if (!mylist.contains(target)) {
				mylist.add(value);
			} else {
				System.out.println("it is " + value + " , " + target);
			}
		}
	}

	public static int[] removeDuplicates(int[] input) {
		Arrays.sort(input);
		int initialValue = input[0];
		int[] result = new int[input.length];
		result[0] = initialValue;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != initialValue) {
				result[i] = input[i];
			}
			initialValue = input[i];
		}
		Arrays.sort(result);

		return result;
	}
}
