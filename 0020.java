https://leetcode.com/problems/valid-parentheses/submissions/1710776884/?envType=problem-list-v2&envId=stack


class Solution {
    public boolean isValid(String s) {
        // create hashmap for unique storage 
        //create stack 
        HashMap <Character , Character> map = new HashMap<>();
        Stack <Character> st = new Stack<>();

        //put values in map for key as closing brackect to its corresponding openning bracket 
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        //convert string to char array to iterrate for stack operations 
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(st.empty()){
                    return false;
                }
                char top = st.pop();
                if(map.get(c) != top){
                    return false;
                }
            }
            else{
                    st.push(c);
                }
        }
        return st.empty();

    }
}
