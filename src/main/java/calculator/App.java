import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Integer> ans = new ArrayList<>(); // 결과값을 저장할 리스트
        Scanner sc = new Scanner(System.in);

        String input;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("연산자를 입력하세요 (+, -, *, /) 또는 'exit'로 종료하거나 'remove'를 입력하여 첫 번째 결과값 삭제하세요: ");
            input = sc.next();

            if (input.equals("exit")) {
                break; // exit 입력 시 반복문 종료
            } else if (input.equals("remove")) {
                if (!ans.isEmpty()) {
                    int removedResult = ans.remove(0);
                    System.out.println("삭제된 결과: " + removedResult);
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
                continue;
            }

            char op = input.charAt(0);
            int result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            System.out.println("결과: " + result);
            ans.add(result);

            // 저장된 결과 값 출력
            System.out.println("저장된 결과 값:");
            for (int i = 0; i < ans.size(); i++) {
                System.out.println((i + 1) + "번째 결과 : " + ans.get(i));
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
