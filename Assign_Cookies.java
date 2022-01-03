class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        
        if(g.length<1 || g.length>30000) return 0;
        if(s.length<0 || s.length>30000) return 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        
        while(i<g.length && j<s.length) {
            if(s[j] >= g[i]) {
                i++;
                j++;
            }
            else j++;
        }
        return i;
    }
}