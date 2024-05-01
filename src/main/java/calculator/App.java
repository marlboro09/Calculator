package calculator;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Integer> results = calculator.getInitializedResults();
        Scanner sc = new Scanner(System.in);

        String input;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("연산자를 입력하세요 (+, -, *, /) 또는 'exit'=종료, 'remove'=첫 번째 결과값 삭제, 'inquiry'=저장된 결과값 확인: ");
            input = sc.next();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("remove")) {
                try {
                    calculator.removeFirstResult();
                    System.out.println("첫 번째 결과가 삭제되었습니다.");
                } catch (CalculatorException e) {
                    System.out.println(e.getMessage());
                }
                continue;
            }
            else if (input.equals("inquiry")) {
                calculator.showResults();
                continue;
            }

            try {
                char op = input.charAt(0);
                int result = calculator.calculate(num1, num2, op);
                System.out.println("결과: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (CalculatorException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
