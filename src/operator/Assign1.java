package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a +=3; //(5 + 3, a = a + 3)
        System.out.println(a);
        a -= 2;//(8 - 2)
        System.out.println(a);
        a *= 4; // (6 * 4 = 24)
        System.out.println(a);
        a /= 3; //(24 / 3 = 8)
        System.out.println(a);
        a %= 5;//(8 % 5 = 3)
        System.out.println(a);
    }
}
