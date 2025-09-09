/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        Node sfg=new Node(0);
        HashSet<Integer> hs=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Node temp=head1;
        while(temp!=null){
            hs.add(temp.data);
            temp=temp.next;
        }
        temp=head2;
        while(temp!=null){
            hs.add(temp.data);
            temp=temp.next;
        }
        
        for(int a:hs){
            pq.offer(a);
        }
        Node kgf=sfg;
        while(!pq.isEmpty()){
            kgf.next=new Node(pq.poll());
            kgf=kgf.next;
        }
        return sfg.next;
    }
}