package level_0;

/**
 * Programmers Lv.0 짝수의 합
 * @author giro
 *
 * 문제 설명
 *  - 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 *  - 0 < n ≤ 1000
 *
 * 입출력 예 설명
 *  #1 : n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
 *  #2 : n이 4이므로 2 + 4 = 6을 return 합니다.
 */

public class SumOfNumbers {
    public static int SumOfNumbers(int n){
        int temp = 0; // 조건에 맞는 숫자의 합을 출력하기 위해 선언 및 값을 지정
        for(int i = 0; i <= n; i++){ // 주어진 숫자까지 하나하나 반복
            if(i % 2 == 0) temp += i; // 2로 나눴을때 temp에 값을 합하는 조건식
        }
        return temp; // 모든 값의 합을 리턴
    }

    public static void main(String[] args) {
        System.out.println("#1 : " + SumOfNumbers(10));
        System.out.println("#2 : " + SumOfNumbers(4));
    }
}
