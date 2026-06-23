class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num: nums){
            if(hash.containsKey(num)==false)
                hash.put(num,1);
            else
                return true;
        }
        return false;
    }
}