public class PM2DimensionalArray {
    static int y, x;
    public int[][] solution(int[][] arr1, int[][] arr2) {
        y=arr1.length; // 행
        x=arr2[0].length; // 열
        int[][] answer = new int[y][x];
        for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
                int sum=0;
                for(int k=0; k<arr2.length; k++) {
                    sum+= arr1[i][k] * arr2[k][j];
                }
                answer[i][j]=sum;
            }
        }

        return answer;
    }
}
