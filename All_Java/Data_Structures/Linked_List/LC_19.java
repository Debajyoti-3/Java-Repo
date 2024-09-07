package Data_Structures.Linked_List;

public class LC_19 {
     class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null){
                return null;
            }
            int size =0;
            ListNode curr = head;
            while(curr !=null){
                curr = curr.next;
                size++;
            }
            if(size == n){
                return head.next;
            }
            int beforeTarget = size -n;
            int index =1;
            ListNode prev = head;
            while(index < beforeTarget){
                prev = prev.next;
                index++;
            }
            prev.next = prev.next.next;
            return head;
        }
    }
}
