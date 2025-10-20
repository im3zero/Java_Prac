package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        System.out.println("====================");


        int sum2 = add(20, 20);
        System.out.println("결과2 출력: " + sum2);

    }
    //add 메서드

    // public ->
    // static -> 갹체를 생서하지 않고 호출할 수 있는 정적 메서드
    // int(반환형) add(메서드 이름)(int(호출하는 형) a, int b)(메서드를 호출할 때 전달하는 입력 값을 정의
    public static int add(int a, int b){
        System.out.println(a + " + "+b+" 연산 수행을 합니다!");
        int sum = a + b;
        return sum; // 결과 돌려주기
        //메서드 본문
        // 메서드가 수행해야하는 코드 블록


    }
}
