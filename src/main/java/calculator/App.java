package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
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
                    calculator.getResults().remove(0);
                    System.out.println("삭제된 결과: " + calculator.getResults().get(0));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("삭제할 결과가 없습니다.");
                }
                continue;
            } else if (input.equals("inquiry")) {
                if (calculator.getResults().isEmpty()) {
                    System.out.println("저장된 결과가 없습니다.");
                } else {
                    System.out.println("저장된 결과 값:");
                    int count = 1;
                    for (int value : calculator.getResults()) {
                        System.out.println(count + "번째 결과 : " + value);
                        count++;
                    }
                }
                continue;
            }

            try {
                char op = input.charAt(0);
                int result = calculator.calculate(num1, num2, op);
                System.out.println("결과: " + result);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
