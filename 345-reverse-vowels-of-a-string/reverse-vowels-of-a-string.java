class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u',
                          'A', 'E', 'I', 'O', 'U')
        );
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            while(i<j && !vowels.contains(ch[i])){
                i++;
            }
            while(i<j && !vowels.contains(ch[j])){
                j--;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}