package DAY_5;

// import java.lang.classfile.components.ClassPrinter.ListNode;

// public class  {

// }
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class IntersectionOfTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a == null)
                a = headB;
            else
                a = a.next;
            if (b == null)
                b = headA;
            else
                b = b.next;
        }
        return a;
    }
}