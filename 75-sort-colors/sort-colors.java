//import java.util.*;
class Solution {
    public void sortColors(int[] arr) {
      int i=0;
      int low=0;
      int end= arr.length-1;

      while(i<=end){
        if(arr[i]== 2){
            int temp= arr[i];
            arr[i]=arr[end];
            arr[end]= temp;
            end--;
        }else if(arr[i] == 0){
            int temp = arr[i];
            arr[i]= arr[low];
            arr[low]=temp;
            i++;
            low++;
        }else{
            i++;
        }
      }

    }
}