class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode perv = null;
        ListNode forward=null;
        while(curr!=null){
            forward=curr.next;
            curr.next=perv;
            perv=curr;
            curr=forward;
        }
        head=perv;
        return head;
    }
}


class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        
        Node newNode = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}
