import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] ans = new int[10]; // 결과값을 저장할 배열
        Scanner sc = new Scanner(System.in);

        int result = 0;//결과값 저장
        String input;
        int index = 0;//결과값의 개수

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("연산자를 입력하세요 (+, -, *, /) 또는 'exit'를 입력하여 종료하세요: ");
            input = sc.next();

            if (input.equals("exit")) {
                break; // exit 입력 시 반복문 종료
            }

            char op = input.charAt(0);
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
                    continue;
                }
                result = num1 / num2;
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            System.out.println("결과: " + result);

            // 배열 이동 및 결과값 저장
            if (index < 10) {
                for (int i = index; i > 0; i--) {
                    ans[i] = ans[i - 1];
                }
                ans[0] = result;
                index++;
            } else {
                for (int i = 9; i > 0; i--) {
                    ans[i] = ans[i - 1];
                }
                ans[0] = result;
            }


            // 저장된 결과 값 출력
            System.out.println("저장된 결과 값:");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + "번째 결과 : " + ans[i]);
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
