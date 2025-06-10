class Solution {
    public int pivotInteger(int n) {
        int prefix[]= new int[n];
        int postfix[]= new int[n];
        prefix[0]= 1;
        postfix[n-1]=n;
        for( int i=1; i< n; i++) prefix[i]= (i+1)+prefix[i-1];
    for( int i=n-2; i>=0; i--) postfix[i]= (i+1)+postfix[i+1];
    for(int i=0;i<n;i++ ){
        if(prefix[i]==postfix[i]){
            return i+1;
        }
    }
    return -1;
    }
}