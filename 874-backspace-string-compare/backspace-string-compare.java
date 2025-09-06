class Solution {
    public boolean backspaceCompare(String s, String t) {
        String finalS = build(s);
        String finalT = build(t);
        return finalS.equals(finalT);
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1); 
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
