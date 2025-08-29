class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(char ch:s1.toCharArray()){
            count1[ch-'a']++;
        }
        int len1=s1.length();
        for(int i=0;i<s2.length();i++){
            count2[s2.charAt(i) - 'a']++;
            if (i >= len1) {
                count2[s2.charAt(i - len1) - 'a']--;
            }
            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
        return false;
    }
}