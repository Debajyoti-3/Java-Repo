package Data_Structures.Linked_List;

public class Palindrome_LC_234 {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        class Solution {
            public ListNode findMiddle(ListNode head){   // Hare & Turtle method
                ListNode hare = head;
                ListNode turtle = head;
                while(hare.next != null && hare.next.next != null){
                    hare = hare.next.next;
                    turtle = turtle.next;
                }
                return turtle ;
            }
            public ListNode reverse (ListNode head){
                ListNode prev = null;
                ListNode curr = head;
                while(curr != null){
                    ListNode next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                return prev;
            }
            public boolean isPalindrome(ListNode head) {
                if(head == null || head.next == null){
                    return true;
                }
                ListNode middle = findMiddle(head);
                ListNode secondHalfFirst = reverse(middle.next);
                ListNode firstHalfFirst = head;
                while(secondHalfFirst != null){
                    if(firstHalfFirst.val != secondHalfFirst.val){
                        return false;
                    }
                    firstHalfFirst = firstHalfFirst.next;
                    secondHalfFirst = secondHalfFirst.next;
                }

                return true;
            }
        }
    }


