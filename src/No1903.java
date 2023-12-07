public class No1903 {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("7542351161"));
    }
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--) {
            if(Character.getNumericValue(num.charAt(i))%2!=0) {
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
