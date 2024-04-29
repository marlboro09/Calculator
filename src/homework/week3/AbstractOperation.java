package homework.week3;

public abstract class AbstractOperation {
    public int num1;
    public int num2;

    public AbstractOperation(int num1, int num2) {//두 개의 정수를 인자로 받아 인스턴스 변수 초기화
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {//메서드 정의
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public abstract double answer(int num1, int num2);//추상메서드 answer 정의
}
