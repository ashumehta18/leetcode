class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int child = g.length; // no. of child
        int cookies = s.length; //no. of cookies

        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;

        while(j<child && i<cookies){
            if(g[j]<=s[i]){
                    j++;
            }
            i++;
        }
    
        return j;
    }
}