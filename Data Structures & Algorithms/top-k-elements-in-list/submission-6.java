class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqTable = new HashMap<>();
        for(int num: nums){
            freqTable.put(num, freqTable.getOrDefault(num,0)+1);
        }
        List<int[]> topFreq = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: freqTable.entrySet()){
            topFreq.add(new int[]{entry.getValue(), entry.getKey()});
        }
        topFreq.sort((a,b)->b[0]-a[0]);
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i]= topFreq.get(i)[1];
        }
        return res;
    }
}
