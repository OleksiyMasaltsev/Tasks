/**Write a function to find the longest common prefix string amongst an array of strings.
 If there is no common prefix, return an empty string "".
 Example 1:
 Input: strs = ["flower","flow","flight"]
 Output: "fl"

 Example 2:
 Input: strs = ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.*/

package ua.masaltsev.exercises;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuffer resultBuffer = new StringBuffer("");

        for (String word : strs) {
            if (!word.isEmpty()) {
                char symbol = word.charAt(0);
            }
            for (int i = 0; i < word.length(); i++) {

            }
        }

        return resultBuffer.toString();
    }
}
