package Data_Structures.Linked_List;

public class Reverse_LL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        class Solution {
            public ListNode reverseList(ListNode head) {
                if(head == null || head.next == null){
                    return head;
                }
                ListNode newHead = reverseList(head.next);

                head.next.next = head;
                head.next = null;
                return newHead;


            }
        }

    }
}
