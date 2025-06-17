class Solution {
    public int kthGrammar(int n, int k) {
        if(k ==1 || n==1) return 0;
        int parK= (k+1)/2;
        int parKth= kthGrammar(n-1, parK);

        if(k%2 == 1){
            return parKth;
        } else{
            return ((parKth == 0)? 1:0);
        }
    }
}