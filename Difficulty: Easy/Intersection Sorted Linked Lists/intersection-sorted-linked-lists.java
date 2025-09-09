/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node ans=null;
        LinkedHashSet<Integer> l1=new LinkedHashSet<>();
        while(head1!=null){
            l1.add(head1.data);
            head1=head1.next;
        }
        LinkedHashSet<Integer> l2=new LinkedHashSet<>();
        while(head2!=null){
            l2.add(head2.data);
            head2=head2.next;
        }
        l1.retainAll(l2);
        Node head = null, curr = null;
        for (int val : l1) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                curr = newNode;
            } else {
                curr.next = newNode;
                curr = newNode;
            }
        }
        return head;
    }
}