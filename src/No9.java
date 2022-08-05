import java.util.ArrayList;
import java.util.List;

public class No9 {
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        int count = 0;
        int div = x;
        List<Integer> arr = new ArrayList();

        while(div != 0) {
            arr.add(div % 10);
            div /= 10;

            count ++;
        }

        for(int i=0; i<count; i++) {
            if(arr.get(i) != arr.get(count - i - 1)) {
                System.out.println(arr.get(i) +"    "+ arr.get(count - i - 1));
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

}
