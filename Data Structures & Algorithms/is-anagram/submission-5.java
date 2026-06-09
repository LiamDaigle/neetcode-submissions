class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            int indexOfChar = t.indexOf(currentChar);
            if(indexOfChar == -1)
                return false;
            
            t = t.substring(0, indexOfChar) + t.substring(indexOfChar + 1);
        }

        return true;
    }
}
