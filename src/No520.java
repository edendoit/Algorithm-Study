public class No520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                    return false;
                }

            }
            return true;

        } else {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                    return false;
                }
            }
            return true;
        }
    }
}
