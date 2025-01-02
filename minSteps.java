class Solution {
    public int minSteps(String s, String t) {
        if(s.equals(t)){
            return 0;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        int ct=0;
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        for(int i=0;i<sc.length;i++){
            a[sc[i]-'a']++;
            b[tc[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            if(b[i]<a[i]){
                ct+=a[i]-b[i];
            }
        }
        return ct;
    }
}
