package level_0;

/**
 * Programmers Lv.0 나머지 구하기
 * @author giro
 *
 * 문제 설명
 *  - 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 *  - 0 < num1 ≤ 100
 *  - 0 < num2 ≤ 100
 *
 * 입출력 예 설명
 *  #1 : num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
 *  #2 : num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
 */

public class Remainder {
    public static int Remainder(int num1, int num2){
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println("#1 : " + Remainder(3, 2));
        System.out.println("#2 : " + Remainder(10, 5));
    }
}
