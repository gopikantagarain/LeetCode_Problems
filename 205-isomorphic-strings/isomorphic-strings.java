class Solution {
    public boolean isIsomorphic(String s, String t) {

        // int map1[]=new int[200];
        // int map2[]=new int[200];

        // if(s.length()!=t.length())
        //     return false;


        // for(int i=0;i<s.length();i++)
        // {
        //     if(map1[s.charAt(i)]!=map2[t.charAt(i)])
        //         return false;

        //     map1[s.charAt(i)]=i+1;
        //     map2[t.charAt(i)]=i+1;
        // }
        // return true;
        HashMap<Character,Character> mp=new HashMap<Character,Character>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch) return false;
            }
            else if(mp.containsValue(tch)){
                return false;
            }
            else{
                mp.put(sch,tch);
            }
        }
        return true;
    }
}