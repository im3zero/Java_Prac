package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        int i = 1;
        for (int row = 0; row <arr.length; row++){
            for (int col = 0; col <arr[row].length; col++){
                arr[row][col] = i++;
                //값을 먼저 대입한 다음에 증가

            }
        }
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
