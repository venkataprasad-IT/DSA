import java.util.*; 
class Solution {
    public int countStudents(int[] students, int[] sand) {
        Queue<Integer> que= new LinkedList<>();
        for(int num: students){
            que.add(num);
        }
    
        int i=0;
        int c=0;
       // int val=0;
        while(!que.isEmpty()){
            if(que.peek() == sand[i]){
                que.poll();
                i++;
                c=0;
            }

            else{
                int a = que.peek();
                que.poll();
                que.offer(a);
                c++;

                if(c>= que.size()){
                  //  val=c;
                   // i= que.size()+1;
                   break;
                }
            }
        }

        return que.size();
    }
}