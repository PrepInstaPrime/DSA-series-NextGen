# Question 1:
https://leetcode.com/problems/reverse-linked-list/ (Amazon, Microsoft, Google, Meta, Apple, Bloomberg, Oracle, Walmart, Adobe, Uber, Goldman Sachs)
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
    public ListNode reverseList(ListNode head) {
        ListNode res=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=res;
            res=head;
            head=temp;
        }
        return res;
    }
}
```
# Question 2:
https://leetcode.com/problems/middle-of-the-linked-list/description/  (Amazon, Google, Microsoft, Meta, Apple, Uber, LinkedIn)
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
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
```
# Question 3:
https://leetcode.com/problems/linked-list-cycle/description/  (Amazon, Google, Microsoft, Meta, Uber, Apple, Bloomberg, Salesforce)
## Solution:
```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
```
# Home Work
- https://leetcode.com/problems/remove-linked-list-elements/description/  (Amazon, Microsoft, Google, Meta, Apple, Adobe, Oracle)
- https://leetcode.com/problems/palindrome-linked-list/description/  (Amazon, Google, Microsoft, Meta, Apple, Uber, ByteDance)
