class Solution {
    public boolean isValid(String word) {
        if(word.length() <= 2){
            return false;
        }
        String lword=word.toLowerCase();
        boolean hasV=false;
        boolean hasC=false;
        for(char ch:lword.toCharArray()){
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    hasV=true;
                }
                else{
                    hasC=true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return hasC && hasV;
    }
}