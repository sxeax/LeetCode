package EasyProblems;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int[] test = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			test[i] = i;
		}

		int[] h = twoSum(test, 14);

		for(int i : h) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> numsMap = new HashMap<>();
		int[] result = new int[2];
		for(int i = 0 ; i < nums.length ; i++) {
			int tmp = target - nums[i];
			if(numsMap.containsKey(tmp)) {
				result[0] = i;
				result[1] = numsMap.get(tmp);
				break;
			}
			numsMap.put(nums[i], i);
		}
		return result;
	}
}
