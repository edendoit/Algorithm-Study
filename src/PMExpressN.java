public class PMExpressN {
    static int min = Integer.MAX_VALUE;
    public static int solution(int N, int number) {
        dfs(0, N, number, 0);
        if (min == Integer.MAX_VALUE) return -1;

        System.out.println("Min => " + min);
        return min;
    }

    public static void dfs(int level, int N, int number, int cur) {
        if(level > 8) {
            return;
        }
        if(number == cur) {
            min = Math.min(min, level);
            return;
        }

        int tmp = 0;
        for(int i=0; i<8; i++) {
            if(level+i < 8) {
                tmp = tmp * 10 + N;
                int sum = level+i+1;
                dfs(level+i+1, N, number, cur+tmp);
                System.out.println("lv. "+sum+"  |  cur. "+ (cur+tmp));
                dfs(level+i+1, N, number, cur-tmp);
                System.out.println("lv. "+sum+"  |  cur. "+ (cur-tmp));
                dfs(level+i+1, N, number, cur/tmp);
                System.out.println("lv. "+sum+"  |  cur. "+ (cur/tmp));
                dfs(level+i+1, N, number, cur*tmp);
                System.out.println("lv. "+sum+"  |  cur. "+ (cur*tmp));
            }
        }
    }
    // https://easybrother0103.tistory.com/132
    public static void main(String[] args) {
        solution(2, 11);
    }
}
