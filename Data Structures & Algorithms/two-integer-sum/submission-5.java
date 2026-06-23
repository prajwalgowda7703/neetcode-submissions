class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookUp = new HashMap<>();
        int want;
        for(int i=0;i<nums.length;i++){
            want = target-nums[i];
            if(lookUp.containsKey(want))
                return new int[]{lookUp.get(want), i};
            else
                lookUp.put(nums[i],i);
        }
        return new int[-1];
    }
}
