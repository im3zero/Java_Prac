package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성


        students[0] = 90;
        students[1] = 90;
        students[2] = 90;
        students[3] = 90;
        students[4] = 90;

        System.out.println("학생 1 점수 : "+students[0]);
        System.out.println("학생 2 점수 : "+students[1]);
        System.out.println("학생 3 점수 : "+students[2]);
        System.out.println("학생 4 점수 : "+students[3]);
        System.out.println("학생 5 점수 : "+students[4]);



    }
}
