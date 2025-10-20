package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {


        int sum = sum(1, 2, 3);
        double average = sum / 3.0;
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;

        sum = sum( 15, 25, 35);
        average = sum / 3.0;
        System.out.println("평균값: " + average);
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}
