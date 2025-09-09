/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp=new ListNode(0);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                pq.offer(head.val);
                head=head.next;
            }
        }
        ListNode kmp=temp;
        while(!pq.isEmpty()){
            kmp.next=new ListNode(pq.poll()); 
            kmp=kmp.next;
        }
        return temp.next;
    }
}