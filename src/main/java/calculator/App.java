package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();// Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();// Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char op = sc.next().charAt(0); // 연산자를 문자로 입력
        int result = 0;
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
        }
        System.out.println("결과: " + result);

    }
}