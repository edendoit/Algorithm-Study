import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No167 {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0, end = (numbers.length-1);
        int[] seq = new int[2];
        if(numbers == null || numbers.length < 2) {
            return seq;
        }
        while(start < end) {
            if(numbers[start] + numbers[end] == target) {
                return new int[]{start+1, end+1};
            } else if (numbers[start] + numbers[end] > target) {end--;}
            else start++;
        }

        return  new int[]{};



    }
}


