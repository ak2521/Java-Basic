class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return head;
        }
        
        ListNode singleList =new ListNode();
        singleList.next=head;
        ListNode ptr=singleList;
        while(ptr.next!=null && ptr.next.next!=null)
        {
            if(ptr.next.val==ptr.next.next.val)
            {
                int value =ptr.next.val;
                while(ptr.next!=null && ptr.next.val==value)
                {
                    ptr.next=ptr.next.next;
                }
            }
            else
            {
                ptr=ptr.next;
            }
        }
        return singleList.next;
    }
}
