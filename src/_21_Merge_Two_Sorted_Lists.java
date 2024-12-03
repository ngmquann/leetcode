import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _21_Merge_Two_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ArrayList<Integer> arrays = new ArrayList<Integer>();
        while (list1 != null) {
            arrays.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            arrays.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arrays);

        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        for(int val : arrays){
            tmp.next = new ListNode(val);
            tmp = tmp.next;
        }
        head = head.next;
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;

        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(4);

        n4.next = n5;
        n5.next = n6;

        printList(n1);
        System.out.println();

        printList(n4);
        System.out.println();

        ListNode newList = mergeTwoLists(n1, n4);
        printList(newList);
        System.out.println();
    }
}
