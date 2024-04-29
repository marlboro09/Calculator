package homework.project.level1;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        char op;
        op = sc.next().charAt(0); //연산자를 문자로 입력받는다

        System.out.println("두번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        double answer = 0;

        if (op == '+') {
            answer = (double) num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + answer);
        } else if (op == '-') {
            answer = (double) num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + answer);
        } else if (op == '*') {
            answer = (double) num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + answer);
        } else if (op == '/') {
            answer = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + answer);
        }
    }
}
