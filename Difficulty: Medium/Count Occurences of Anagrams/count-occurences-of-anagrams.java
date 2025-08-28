// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int window=pat.length();
        int count=0;
        int []pCount=new int[26];
        int []sCount=new int[26];
        for(char c:pat.toCharArray()){
            pCount[c-'a']++;
        }
        for(int i=0;i<txt.length();i++){
            sCount[txt.charAt(i)-'a']++;
            if(i>=window){
                sCount[txt.charAt(i-window)-'a']--;
            }
            if(Arrays.equals(pCount,sCount)){
                count++;
            }
        }
        return count;
        
    }
}