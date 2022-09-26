class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        int length=getLength(head);
        int c=length-n;
        ListNode curr=head;
        ListNode perv=null;
        if(c==0){
            head=DeleteAtEnd(head);
            return head;
        }
        int i=0;
        while(i++<c){
            perv=curr;
            curr=curr.next;
        }
        perv.next=curr.next;
        curr.next=null;
        return head;
    }
    public ListNode DeleteAtEnd(ListNode head){
        return head.next;
    }
    public int getLength(ListNode head){
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }
}
