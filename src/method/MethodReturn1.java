package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            //나머지가 1이면 true, 0이면 false
            return true;
        }
        else {
            return false;
        }
    }
}
//return문을 만나면 로직을 바로 빠져나감

