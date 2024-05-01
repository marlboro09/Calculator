package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) throws CalculatorException {
        int result;
        try {
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
        } catch (ArithmeticException e) {
            throw new CalculatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } catch (IllegalArgumentException e) {
            throw new CalculatorException("잘못된 연산자입니다.");
        } finally {
            System.out.println("계산이 완료되었습니다.");
        }
    }

    public List<Integer> getResults() {
        return results;
    }

    // 연산 결과를 초기화된 상태로 반환하는 메서드
    public List<Integer> getInitializedResults() {
        return new ArrayList<>(results);
    }

    public void removeFirstResult() throws CalculatorException {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            throw new CalculatorException("삭제할 결과가 없습니다.");
        }
    }

    public void showResults() {
        if (results.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("저장된 결과 값:");
            int count = 1;
            for (int value : results) {
                System.out.println(count + "번째 결과 : " + value);
                count++;
            }
        }
    }
}

class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}
