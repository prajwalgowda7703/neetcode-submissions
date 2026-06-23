class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hmap = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            int want = target - nums[i];
            if (hmap.containsKey(want)) {
                return new int[]{hmap.get(want), i};  // stored < i, always correct order
            }
            hmap.put(nums[i], i);   // add AFTER checking
        }

        return new int[]{};
    }
}