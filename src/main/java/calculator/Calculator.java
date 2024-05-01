package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) throws ArithmeticException, IllegalArgumentException {
        int result;
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
                    throw new ArithmeticException("분모에 0이 들어올 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }
}

class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super("예외가 발생했습니다.");
    }
}
