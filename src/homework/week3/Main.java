package homework.week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // 연산자는 문자로 입력받음

        System.out.println("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // Calculator 인터페이스를 구현하는 구체 클래스의 인스턴스 생성
        Calculator calculator;
        switch (operator) {
            case '+':
                calculator = new AddOperation(num1, num2);
                break;
            case '-':
                calculator = new SubstractOperation(num1, num2);
                break;
            case '*':
                calculator = new MultiplyOperation(num1, num2);
                break;
            case '/':
                calculator = new DivideOperation(num1, num2);
                break;
            default:
                System.out.println("입력을 잘못 하셨습니다");
                return;
        }

        // 계산 수행 및 결과 출력
        double result = calculator.answer(num1, num2);
        System.out.println("결과는 : " + result);

        scanner.close();
    }
}
