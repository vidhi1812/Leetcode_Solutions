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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
     if(head.next == null)
         return head;
    ListNode num1=head;
        ListNode num2=head.next;
        while(num1.next!=null){
            ListNode n=new ListNode();
            n.val=gcd(num1.val,num2.val);
            num1.next=n;
            n.next=num2;
            num1=num2;
            num2=num2.next;
        }
        return head;
    }
 int gcd(int a, int b){
     if(b == 0)
         return a;
    return gcd(b,a%b);
 }
}