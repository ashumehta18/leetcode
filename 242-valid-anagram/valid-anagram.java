class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) +1);
        }
        for(int j = 0 ;j<t.length();j++){
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                if (map.get(t.charAt(j)) < 0){
                    return false;
                }
                //count -- krna h of a particular char
                //if count less than 0 jae toh bhi false return 
            }else{
                return false;
            }
        }

        return true;
    }
}