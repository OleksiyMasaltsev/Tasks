package ua.masaltsev.exercises;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();

        int head1 = list1.val;
        int head2 = list2.val;

        if (head1 <= head2) {
            result.val = head1;
            head1 = list1.next.val;
        } else {
            result.val = head2;
            head2 = list2.next.val;
        }



        return null;
    }

}
