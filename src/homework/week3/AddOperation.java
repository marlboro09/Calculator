package homework.week3;

public class AddOperation extends AbstractOperation implements Calculator {
    public AddOperation(int num1, int num2) { //AddOperation 클래스의 생성자
        super(num1, num2);//AbstractOperation 클래스 생성자 호출
    }
    @Override
    public double answer(int num1, int num2) {//answer메서드 구현
        return (double)num1 + num2;
    }
}
