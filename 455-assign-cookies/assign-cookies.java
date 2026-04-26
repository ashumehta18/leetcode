class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       // int count = 0;
        int n = s.length;
        int i = 0;
        int j = 0;
        while(i<n && j<g.length){
            if(g[j]<=s[i]){
              //  count++;
                j++;
            }
            i++;
        }
        return j;
    }
}