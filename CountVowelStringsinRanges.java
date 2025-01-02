class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ct=0;
        int[] test=isValid(words);
        int ans[]=new int[queries.length];
        for(int q[]:queries){
            if(q[0]==0){
                ans[ct]+=test[q[1]];
            }
            else{
                ans[ct]+=test[q[1]]-test[q[0]-1];
            }
            ct++;
        }
        return ans;
    }
    public int[] isValid(String[] s){
        String temp="aeiou";
        int[] r=new int[s.length];
        int l=1;
        for(int i=0;i<s.length;i++){
            if(temp.contains(s[i].substring(0,1)) && temp.contains(s[i].substring(s[i].length()-1,s[i].length()))){
                r[i]=l++;
            }
            else{
                if(i==0) r[i]=0;
                else r[i]=r[i-1];
            }
        }
        return r;
    }
}
