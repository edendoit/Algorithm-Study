public class No338 {
    public static int[] countBits(int num) {

        int[] answer = new int[num+1];

        if(num >= 0)
            answer[0] = 0;

        for(int i = 1;i<=num;i++){
            System.out.println("answer[i]="+answer[i]);
            answer[i] = answer[i/2] + i%2;
            System.out.println("Changed answer[i]="+answer[i]);

        }

        return answer;
    }
    public static void main(String[] args) {
        countBits(4);
    }
}

