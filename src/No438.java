public class No438 {
    List<Integer> result = new ArrayList();
        if (p.length() > s.length()) return result;
    int[] a = new int[26];
        for (char ch : p.toCharArray()) {
        a[ch -'a']++;
    }
    int[] b = new int[26];
        for (int l = 0, r = 0; r < s.length(); r++) {
        b[s.charAt(r) - 'a']++;
        if (r - l + 1 == p.length()) {
            if (Arrays.equals(a, b)) result.add(l);
            b[s.charAt(l++) -'a']--;
        }
    }
        return result;
}
