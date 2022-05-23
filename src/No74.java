public class No74 {

        public boolean searchMatrix(int[][] matrix, int target) {


            int m = matrix.length;
            int n = matrix[0].length;

            int i=0, j=0;
            while(i<m && j < n){
                if(matrix[i][j] == target)
                    return true;
                else if(matrix[i][j]< target)
                    j++;
                else if(j==(n-1)){
                    j=0;
                    i++;
                }
            }
            return false;

        }

    public boolean searchMatrix2(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length-1;

        int i=0, j=0;
        while(i<m && j <= n){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j]< target){
                if(j == n) {
                    i++;
                    j=0;
                } else{
                    j++;
                }
            }
            else if(matrix[i][j] > target){
                i++;
            }
        }
        return false;


    }

}
