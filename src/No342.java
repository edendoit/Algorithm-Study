public class No342 {
    public static boolean isPowerOfFour(int n) {
        if (n==0) return false;
        double x;
        double doubleN = n;
        x = (Math.log10(doubleN) / Math.log10(4));
        System.out.println("x = "+ x);
        if(isNumeric(x) == true) {
            return true;
        }
        else
            return false;
    }

    public static boolean isNumeric(double x) {
        if(Math.ceil(x) == Math.floor(x)) return true;
        else return false;
    }

    public static void main(String[] args) {
        isPowerOfFour(5);
    }
}
