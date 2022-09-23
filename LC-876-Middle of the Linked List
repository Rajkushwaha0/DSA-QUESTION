//modular program

class Solution {
    public ListNode middleNode(ListNode head) {
        int length=getLength(head);
        // if(length%2==0){
        //     int middleIndex=length/2;
        //     return getMiddle(head,middleIndex);
        // }
        // else{
        //     int middleIndex=length/2;
        //     return getMiddle( head,middleIndex);
        // }
        int middleIndex=length/2;
        return getMiddle(head,middleIndex);
    }
    public int getLength(ListNode head){
        ListNode curr=head;
        int l=0;
        while(curr!=null){
            l++;
            curr=curr.next;
        }
        return l;
    }
    public ListNode getMiddle(ListNode head,int c){
        ListNode temp=head;
        int i=0;
        while(i<c){
            i++;
            temp=temp.next;

        }
        return temp;
    }
}
