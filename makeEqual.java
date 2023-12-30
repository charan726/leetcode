class Solution {
    public boolean makeEqual(String[] words) {
        String a="";
        int n=words.length;
        for(String temp:words){
            a+=temp;
        }
        char[] ac=a.toCharArray();
        Arrays.sort(ac);
        int c=1;
        for(int i=0;i<ac.length-1;i++){
            if(ac[i]==ac[i+1]){
                c++;
            }
            else{
                if(c%n !=0){
                    return false;
                }
                c=1;
            }
        }
        if(c%n!=0){
            return false;
        }
        return true;
    }
}
