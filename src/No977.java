import java.util.Arrays;

public class No977 {
    public static int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];
        int temp = 0;

        for(int i=0; i<nums.length; i++) {
            output[i] = nums[i] * nums[i];
        }

        for(int i=0; i<output.length-1; i++) {

            for(int j=i; j<output.length; j++) {
                if(output[i] > output[j]) {
                    temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;

                }
            }

        }
        return output;

    }
    public static void main(String[] args) {


        sortedSquares(new int[]{-4, -1, 0, 3, 10});
    }
}
