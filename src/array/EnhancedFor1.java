package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for 문
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }//내가 직접 인덱스를 선언... 등등등

        for (int number : numbers) {
            System.out.println(number);
        }//값을 꺼내서 돌리기
        //처음부터 끝까지 배열을 돌릴 떄 사용

    }
    //단축키 iter!!!!!!!!!!!

    // foreach 문을 사용할 수 없는 경우. 증가하는 index값 필요


}
