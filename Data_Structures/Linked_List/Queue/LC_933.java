package Data_Structures.Queue;
import java.util.*;

public class LC_933 {
    class RecentCounter {
        Queue <Integer> q ;

        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            if(q.size()==0){
                q.add(t);
                return 1;
            }

            else{
                if(t<=3000){
                    q.add(t);

                }
                else if(t>3000){
                    int margin = t-3000;
                    while(q.size()!=0 && q.peek()<margin){
                        q.remove();
                    }
                    q.add(t);
                }
                return q.size();
            }

        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}
