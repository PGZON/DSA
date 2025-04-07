package DAY_5;
//leetcode 21
// public class  {
    
// }
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
class MergeTwoSortList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n = new ListNode();
        ListNode head = n;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                n.next = list2;
                n = list2;
                list2 = list2.next;
            } else {
                n.next = list1;
                n = list1;
                list1 = list1.next;

            }
        }
        while (list1 != null) {
            n.next = list1;
            n = list1;
            list1 = list1.next;
        }
        while (list2 != null) {
            n.next = list2;
            n = list2;
            list2 = list2.next;
        }
        return head.next;
    }
}