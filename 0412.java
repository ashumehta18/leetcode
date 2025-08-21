https://leetcode.com/problems/fizz-buzz/solutions/7043606/arraylist-by-ashu_129-ts2r/


class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1 ; i<=n ;i++){
            if(i%15 == 0){
                result.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else if(i%5 == 0){
                result.add("Buzz");
            }
            else{
                result.add(String.valueOf(i));
            }
           //index 3 se divide h toh fizz
           // index 5 se divide h toh buzz
           //both = fizzbuzz
           //else print i 
          
        }
         return result;
    }
}
