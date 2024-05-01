package calculator;

import java.util.HashMap;
import java.util.Map;

// 연산자 입력이 잘못된 경우에 발생하는 예외 클래스
class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super("잘못된 연산자입니다.");
    }
}

// 나눗셈에서 분모에 0이 들어온 경우에 발생하는 예외 클래스
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super("나눗셈의 분모는 0이 될 수 없습니다.");
    }
}

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드
    private Map<String, Double> results;

    // 생성자에서 결과를 저장할 맵을 초기화합니다.
    public Calculator() {
        results = new HashMap<>();
    }

    // 사칙연산을 수행하는 메서드
    public double calculate(int num1, char operator, int num2) throws InvalidOperatorException, DivideByZeroException {
        double result = 0;
        switch (operator) {
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
                    throw new DivideByZeroException("0으로 나눌 수 없습니다.");
                }
                result = (double) num1 / num2;
                break;
            default:
                throw new InvalidOperatorException("올바르지 않은 연산자입니다.");
        }
        // 결과를 맵에 저장합니다.
        String key = num1 + " " + operator + " " + num2;
        results.put(key, result);
        return result;
    }

    // 이전 연산 결과를 반환하는 메서드
    public double getResult(String expression) {
        return results.getOrDefault(expression, Double.NaN); // expression에 해당하는 결과가 없으면 NaN을 반환합니다.
    }
}
