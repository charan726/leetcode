class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        int arr[][]=new int[n+1][2];
        arr[0][0]=0;
        arr[0][1]=0;
        int k=1,x=0,y=0;
        for(int i=0;i<n;i++){
            switch(path.charAt(i)){
                case 'N':
                    x=arr[k-1][0]+1;
                    y=arr[k-1][1];
                    break;

                case 'S':
                    x=arr[k-1][0]-1;
                    y=arr[k-1][1];
                    break;
                    
                case 'E':
                    x=arr[k-1][0];
                    y=arr[k-1][1]+1;
                    break;

                case 'W':
                    x=arr[k-1][0];
                    y=arr[k-1][1]-1;
                    break;
            }
            if(isdup(arr,k,x,y)){
                return true;
            }
            arr[k][0]=x;
            arr[k][1]=y;
            k++;
            
        }
        return false;
    }
    static boolean isdup(int a[][],int n,int x,int y){
        for(int i=0;i<n;i++){
            if(a[i][0]==x && a[i][1]==y){
                return true;
            }
        }
        return false;
    }
}
