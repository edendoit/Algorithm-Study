public class No338 {
    public int[] countBits(int num) {

        int[] answer = new int[num+1];

        if(num >= 0)
            answer[0] = 0;

        for(int i = 1;i<=num;i++){

            answer[i] = answer[i/2] + i%2;

        }

        return answer;
    }
}
        }
