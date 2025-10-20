package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    }; //행2, 열3 (2차원 배열)

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
                //열 탐색
            }
            System.out.println();
            //행 탐색
        }

    }
}
