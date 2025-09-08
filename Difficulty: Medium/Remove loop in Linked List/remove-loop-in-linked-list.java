/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // loop detected
                slow = head;

                // Step 2: Find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Step 3: Find last node of loop
                while (fast.next != slow) {
                    fast = fast.next;
                }

                // Step 4: Break loop
                fast.next = null;
                return;
            }
        }
    }
}
