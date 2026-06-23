class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap();

        for(String s: strs){
            String sorted = sortedString(s);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(s);
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;

    }

    private String sortedString(String st){
        char[] char_array = st.toCharArray();
        Arrays.sort(char_array);
        return new String(char_array);
    }

}
