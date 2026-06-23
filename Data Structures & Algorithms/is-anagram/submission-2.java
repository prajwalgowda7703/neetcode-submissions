class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cArrayS = s.toCharArray();
        char[] cArrayT = t.toCharArray();
        Arrays.sort(cArrayS);
        Arrays.sort(cArrayT);
        if(Arrays.equals(cArrayS,cArrayT)== false)
            return false;
        else
            return true;
    }
}
