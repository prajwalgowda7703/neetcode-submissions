class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
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
