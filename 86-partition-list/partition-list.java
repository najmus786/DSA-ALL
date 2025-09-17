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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=new ListNode(0);
        ListNode tmp=new ListNode(0);
        ListNode curr=temp;
        ListNode trt=tmp;
        while(head!=null){
            if(head.val<x){
                curr.next=head;
                curr=curr.next;
            }else{
                trt.next=head;
                trt=trt.next;
            }
            head=head.next;
        }
        curr.next=tmp.next;
        trt.next = null;
        return temp.next;
    }
}