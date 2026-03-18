# Question 1: 
https://leetcode.com/problems/remove-linked-list-elements/description/  (Amazon, Microsoft, Google, Meta, Apple, Adobe, Oracle)
## Solution: 
```
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head.next;
    }
}
```
# Question 2: 
https://leetcode.com/problems/palindrome-linked-list/description/  (Amazon, Google, Microsoft, Meta, Apple, Uber, ByteDance)
## Solution: 
```
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            st.push(slow.val);
        }
        while(slow!=null&&!st.isEmpty()){
            if(slow.val!=st.pop()){
                return false;
            }
            slow=slow.next;
        }
        return true&&st.isEmpty();
    }
}
```
# Question 3: 
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/  (Amazon, Meta, Google, Microsoft, Apple, Bloomberg, LinkedIn)
## Solution: 
```
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        ListNode first=head;
        ListNode second = head;
        for(int i=0;i<n;i++){
            first=first.next;
        }
        while(first!=null&&first.next!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return head.next;
    }
}
```
# Home Work:
- https://leetcode.com/problems/merge-two-sorted-lists/description/  (Amazon, Google, Microsoft, Meta, Apple, LinkedIn, Salesforce, Adobe)
- https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/  (Amazon, Microsoft, Google, Meta, Apple, Oracle)
- https://leetcode.com/problems/rotate-list/description/  (Amazon, Google, Microsoft, Meta, Bloomberg)
- https://leetcode.com/problems/intersection-of-two-linked-lists/description/  (Amazon, Google, Microsoft, Meta, Apple, Bloomberg, Uber, Goldman Sachs)
- https://leetcode.com/problems/reverse-nodes-in-even-length-groups/description/ (Amazon, Meta, Google, Microsoft, ByteDance)​
- https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/ (Amazon, Google, Microsoft, Meta)
- https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/ (Amazon, Meta, Google, Microsoft, Apple)​