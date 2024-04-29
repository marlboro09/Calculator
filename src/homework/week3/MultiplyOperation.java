package homework.week3;

public class MultiplyOperation extends AbstractOperation implements Calculator{
    public MultiplyOperation(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public double answer(int num1, int num2) {
        return (double)num1 * num2;
    }
}
