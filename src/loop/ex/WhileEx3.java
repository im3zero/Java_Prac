package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 10;
        while (i < max){
            sum += i;
            i ++;
        }
        System.out.println("//max = "+ max);
        System.out.println(sum);
    }
}
