class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int l=s.length()-1;
        while(i<=l){
            char currFirst = s.charAt(i);
        	char currLast = s.charAt(l);
            if (!Character.isLetterOrDigit(currFirst)) {
        		i++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		l--;
            }
            else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		i++;
        		l--;
            }
        }
        return true;
    }
}