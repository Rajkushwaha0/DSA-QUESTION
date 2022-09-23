class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        
        int length = getLength(head);
        int middle = length/2;
        int l = 0;
        ListNode perv = null;
        ListNode curr = head;
        while(l++ < middle){
            perv = curr;
            curr = curr.next;
        }
        perv.next = curr.next;
        curr.next = null;
        return head;
        
    }
    public int getLength(ListNode head){
        ListNode curr=head;
        int c = 0;
        while(curr!=null){
            c++;
            curr = curr.next;
        }
        return c;
    }
}
