https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // for every key in loser array present 
        // if once present == list.add in ans[0];
        // not present = list.add in ans[1];

        List<List<Integer>> result = new ArrayList<>();
        int[] loss = new int[100001];
        boolean[] seen = new boolean[100001];

        for (int[] match : matches){
            int winner = match[0];
            int loser =match[1];

            loss[loser]++;
            seen[winner] = true;
            seen[loser] = true ;
        }

        List <Integer> neverlost = new ArrayList<>();
        List <Integer> oncelost = new ArrayList<>();

        for(int i = 1; i<100001;i++){
            if(!seen[i]){
                continue;
            }
            if(loss[i] == 0){
                neverlost.add(i);
            }
            if(loss[i] == 1){
                oncelost.add(i);
            }
        }
        result.add(neverlost);
        result.add(oncelost);
        return result;
    }
}
