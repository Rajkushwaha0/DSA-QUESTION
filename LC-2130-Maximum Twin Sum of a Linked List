class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        int max=0;
        int j=l.size()-1;
        int i=0;
        while(i<j){
            int sum=l.get(i)+l.get(j);
            max=Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}
