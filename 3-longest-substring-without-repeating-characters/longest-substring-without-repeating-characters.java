class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashMap<Character , Integer> map = new HashMap<>();

        while(right<s.length()){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                left = Math.max(map.get(ch) +1,left);
            }
            map.put(ch,right);
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}