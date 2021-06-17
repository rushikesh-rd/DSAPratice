//  https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
class SumOfAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j = j + 2) {
				for (int k = i; k <= j; k++) {
					ans = ans + arr[k];
				}
			}
		}
        return ans;
    }
}

