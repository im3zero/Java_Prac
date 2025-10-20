package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: "+ number);
        //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 전, number: "+ number);
        //5

    }
public static void changeNumber(int number){
    System.out.println("2. changeNumber 변경 전, number: "+ number);
    //5
    number = number * 2;
    // 다른 메모리 공간에 있는 다른 number의 값을 바꾼 것임
    System.out.println("3. changeNumber 변경 후, number: "+ number);
    //10
}


}

