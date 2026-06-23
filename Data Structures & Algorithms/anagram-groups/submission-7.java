class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String s: strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedS = new String(sArray);
            anagram.putIfAbsent(sortedS,new ArrayList<>());
            anagram.get(sortedS).add(s);
        }
        return new ArrayList<>(anagram.values());
    }
}
