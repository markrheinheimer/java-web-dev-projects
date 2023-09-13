package org.launchcode;
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        boolean isOpening = false;
        boolean hasBracket = false;

        if (str.length() == 0) return true;

        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == ']') {
                hasBracket = true;
            }
        }

        if (hasBracket == false) return false;

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                isOpening = true;
            } else if (ch == ']') {
                brackets--;
                isOpening = false;
            }
        }
        return brackets == 0 && isOpening == false;
    }
}