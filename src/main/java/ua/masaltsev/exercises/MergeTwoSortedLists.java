package ua.masaltsev.exercises;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resultHead = new ListNode();
        ListNode nextNode;

        while (list1 != null && list2 != null) {

            nextNode = new ListNode();

            if (list1.val <= list2.val) {
                nextNode.val = list1.val;
                list1 = list1.next;
            } else {
                nextNode.val = list2.val;
                list2 = list2.next;
            }
        }

        return null;
    }

}
