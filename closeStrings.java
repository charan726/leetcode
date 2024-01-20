class Solution {
    public boolean closeStrings(String w1, String w2) {
        if(w1.length()!=w2.length()){
            return false;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        for(char c:w1.toCharArray()){
            a[c-'a']++;
        }
        for(char c:w2.toCharArray()){
            b[c-'a']++;
        }
        int ct=0;
        for(int i=0;i<26;i++){
            if((a[i]+b[i]==a[i] && a[i]!=0)||( a[i]+b[i]==b[i] && b[i]!=0)){
                return false;
            }
            if(a[i]!=b[i]){
                ct++;
            }
        }
        if(ct==0){
            return true;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        ct=0;
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                ct++;
            }
        }
        if(ct==0){
            return true;
        }
        return false;
    }
}
