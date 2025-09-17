/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    
    Node deleteMid(Node head) {
        
        // This is method only submission.
        // You only need to complete the method.
        if (head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        Node prev = null;

        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = slow.next;
        }

        return head;
        
    }
}