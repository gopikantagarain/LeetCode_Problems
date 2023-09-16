class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        TreeMap<Integer,String>m=new TreeMap();
        for(int i=0;i<h.length;i++){
            m.put(h[i],names[i]);
        }
        int i=names.length-1;
        for(Map.Entry<Integer,String> s: m.entrySet()){
            names[i--]=s.getValue();
        }
        return names;
    }
}