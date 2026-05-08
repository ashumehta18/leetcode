class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length; //child
        int m = s.length;//cookies
        Arrays.sort(g);
        Arrays.sort(s);

        int i =0 , j = 0;

        while(i<n && j<m){ //i<child //j<cookies
            if(g[i]<=s[j]){ //
                i++;
            }
                j++;
            
        }
        return i;
    }
}
