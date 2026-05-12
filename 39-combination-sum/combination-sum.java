class Solution {

    public void com(int[] can , int idx, int target , List<List<Integer>> res , List<Integer> ans){
       
            if(target == 0){
                res.add(new ArrayList<>(ans));
                return;
            }
             if(idx == can.length){
            return;
        }
        if(can[idx]<=target){
            ans.add(can[idx]);
            com(can,idx,target-can[idx],res,ans);
            ans.remove(ans.size()-1);
        }
        com(can,idx + 1 ,target,res,ans);

    }
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> res = new ArrayList<>();
        com(can,0,target,res, new ArrayList<>());
        return res;
    }
}
//pick and not pick 
//single element at nth times
//left recursion is called first 
