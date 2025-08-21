https://leetcode.com/problems/time-needed-to-buy-tickets/solutions/7041741/one-pass-linear-traversal-by-ashu_129-ku23/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //Queue<Integer> q = new Queue<>();
        int time = 0;
        
            for(int i =0 ; i < tickets.length ;i++){
                if(i <= k){
                    time += Math.min(tickets[k] , tickets[i]);
                }else{
                    time += Math.min(tickets[k] -1 , tickets[i]);
                }
            }

        return time;
    }
}
