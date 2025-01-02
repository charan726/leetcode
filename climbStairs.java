class Solution {
    public int climbStairs(int n) {
        int a=2;
        int b=3;
        int sum=a+b;
        if(n==1){
            return 1;
        }
        else if(n==2){
            return a;
        }
        else if(n==3){
            return b;
        }
        for(int i=4;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
            sum=a+b;
        }
        return sum;
    }
}
