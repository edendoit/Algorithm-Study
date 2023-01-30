public class No1139 {
    public static void main(String[] args) {
        String str = "0";
        str += "0";
        System.out.println(str);
    }
    // wrong solution
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        String res = "1";
        for(int i=2; i<n; i++) {
            res +="0";
        }
        return Integer.parseInt(res, 2);
    }
}
