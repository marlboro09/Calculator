package homework.week3;

public class DivideOperation extends AbstractOperation implements Calculator{
    public DivideOperation(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public double answer(int num1, int num2) {
        return (double)num1 / num2;
    }
}