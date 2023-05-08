package java_10;
import java.util.Random;

public class StringMathTest {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            double num = rand.nextInt(2) == 0 ? rand.nextInt(100) + 1 : rand.nextDouble() * 100;
            sb.append(String.format("%.2f", num)).append(" ");
            if (i < 2) {
                String operator = "+-*/".charAt(rand.nextInt(4)) + " ";
                sb.append(operator);
            }
        }

        String soperand = sb.toString().trim();
        String[] operand = soperand.split("[+\\-*/\\s]+");

        System.out.print("계산식>> ");
        for (int n = 0; n < soperand.length(); n++) {
            char c = soperand.charAt(n);
            if (c == ' ') {
                continue;
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                System.out.print(" " + c + " ");
            } else {
                System.out.print(c);
            }
        }
        System.out.println();

        System.out.println("피연산자 분리 결과");
        for (int n = 0; n < operand.length; n++) {
            System.out.println(operand[n]);
        }

        double sum = 0;
        for (int i = 0; i < operand.length; i++) {
            sum += Double.parseDouble(operand[i]);
        }
        System.out.printf("(숫자들만의 합 계산결과: %.2f)\n", sum);

        double result = Double.parseDouble(operand[0]);
        for (int i = 1; i < operand.length; i++) {
            String operator = soperand.substring(soperand.indexOf(operand[i - 1]) + operand[i - 1].length(),
                    soperand.indexOf(operand[i])).trim();
            if (operator.equals("+")) {
                result += Double.parseDouble(operand[i]);
            } else if (operator.equals("-")) {
                result -= Double.parseDouble(operand[i]);
            } else if (operator.equals("*")) {
                result *= Double.parseDouble(operand[i]);
            } else if (operator.equals("/")) {
                result /= Double.parseDouble(operand[i]);
            }
        }
        System.out.printf("(계산식에 의한 계산결과: %f)\n", result);
    }
}

