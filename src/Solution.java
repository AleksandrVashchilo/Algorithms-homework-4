public class Solution {

    public static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {

                if (s.length() == 2) {
                    return "YES";
                }
                // рекурсивное условие
                return recursion(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }
}