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
    public int getDecimalValue(ListNode head) {
    String str="";
    ListNode ptr=head;
    if(head==null)
    {
        return 0;
    }
    while(ptr.next!=null)
    {
        
        str=str+String.valueOf(ptr.next.val);
        ptr=ptr.next;
    }
    str=String.valueOf(head.val)+str;
    return Integer.parseInt(str,2);
    }
}
