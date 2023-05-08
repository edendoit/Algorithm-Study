public class PMTargetNumber {
    static int answer;
    public static int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(numbers, target,0,0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int index, int sum) {
        if(index == numbers.length) {
            if(sum == target){
                answer ++;
                System.out.println("answer 증가 =>>>>" + answer);
                System.out.println("("+index+", "+sum+")");
                System.out.println("==============================");
            }
            return;
        }

        dfs(numbers, target, index+1, sum+numbers[index]);
        dfs(numbers, target, index+1, sum-numbers[index]);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
