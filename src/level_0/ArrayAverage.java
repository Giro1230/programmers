package level_0;

/**
 * Programmers Lv.0 배열의 평균값
 * @author giro
 *
 * 문제 설명
 *  - 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 *  - 0 ≤ numbers의 원소 ≤ 1,000
 *  - 1 ≤ numbers의 길이 ≤ 100
 *  - 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 *
 * 입출력 예 설명
 *  #1 : numbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])의 원소들의 평균 값은 5.5입니다.
 *  #2 : numbers([89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99])의 원소들의 평균 값은 94.0입니다.
 */

public class ArrayAverage {
    public static double ArrayAverage(int[] numbers){
        double temp = 0; // double 타입의 temp를 선언 및 초기화

        for(int num : numbers){
            temp += num; // 배열의 모든 값을 temp에 저장
        }

        return temp / numbers.length; // temp에 배열의 갯수를 나눠 평균을 도출
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println("#1 : " + ArrayAverage(test1));
        System.out.println("#2 : " + ArrayAverage(test2));
    }
}
