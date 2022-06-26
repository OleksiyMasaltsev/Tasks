package ua.masaltsev.exercises;

public class AddTwoNumbers {

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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            String reverseNumber1 = "";
            String reverseNumber2 = "";

            reverseNumber1 = extractReverseNumber(l1, reverseNumber1);
            reverseNumber2 = extractReverseNumber(l2, reverseNumber2);

            int sum = 0;
            StringBuilder stringBuilder1 = new StringBuilder(reverseNumber1).reverse();
            StringBuilder stringBuilder2 = new StringBuilder(reverseNumber2).reverse();

            try {
                int i = Integer.parseInt(stringBuilder1.toString());
                int j = Integer.parseInt(stringBuilder2.toString());
                sum = i + j;
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }

            String result = String.valueOf(sum);

            ListNode resultList = new ListNode();

            for (int i = 0; i < result.length(); i++) {
                resultList.next = new ListNode();
                resultList.val = result.charAt(i);
            }

            return resultList;
        }

        private String extractReverseNumber(ListNode listNode, String reverseNumber) {

            ListNode currentNode = listNode;

            while (true) {

                reverseNumber = reverseNumber.concat(String.valueOf(currentNode.val));

                if (currentNode.next == null) {
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }

            return reverseNumber;
        }
    }

}
