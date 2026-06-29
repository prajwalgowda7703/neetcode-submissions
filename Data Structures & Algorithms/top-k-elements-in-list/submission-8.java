class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        List<Integer>[] fT = new List[nums.length+1];
        for(int i=0; i<fT.length;i++){
            fT[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            fT[entry.getValue()].add(entry.getKey());
        }
        int[] res=new int[k];
        int index=0;
        for(int i =fT.length-1; i>0&&index<k; i--){
            for(int n : fT[i]){
                res[index]=n;
                if(index==k)
                    return res;
                index++;
            }
        }
        return res;
    }
}
