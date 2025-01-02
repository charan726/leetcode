class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> ct=new ArrayList<>();
        int c=1;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                c++;
            }
            else{
                if(check(ct,c)){
                    ct.add(c);
                    c=1;
                }
                else{
                    return false;
                }
            }
        }
        if(check(ct,c)){
                    ct.add(c);
                    c=1;
                }
                else{
                    return false;
                }
        return true;
    }
    public boolean check(List<Integer> ct,int c){
        for(int x:ct){
            if(x==c){
                return false;
            }
        }
        return true;
    }
}
