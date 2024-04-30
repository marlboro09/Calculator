package calculator;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args) {

        int[] ans = new int[10];//결과값을 저장할 배열
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();// Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();// Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char op = sc.next().charAt(0); // 연산자를 문자로 입력
            result = 0;
            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                    return;
                }
                result = num1 / num2;
            } else {
                System.out.println("연산자를 잘못 입력하셨습니다. ");
                return;
            }
            System.out.println("결과: " + result);
            ans[i] = result;
        }

        // 저장된 결과 값 출력
        System.out.println("저장된 결과 값:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "번째 결과 : " + ans[i]);
        }


    }
}