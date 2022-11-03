import java.util.Scanner;

public class sum2 {
    public static void main(String[] args){
        int sum = 0;

        for (int i = 6; i < 45; i++) sum += i;
        System.out.println("Сумма = " + sum);
    }

    public static class Try {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1, num2, operation);
            System.out.println("Result of operation: " + result);
        }

        // проверка
        public static int getInt() {
            System.out.println("Enter number: ");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Wrong number, try again.");
                scanner.next();
                num = getInt();
            }
            return num;
        }

        // выбор операции
        public static char getOperation() {
            System.out.println("Choose operation + - * / ");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Wrong operation, try again + - * /");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

        //вычисления
        public static int calc(int num1, int num2, char operation) {
            int result = 0;
            switch (operation) {
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
                    try {
                        result = num1 / num2;
                    } catch (ArithmeticException e) {
                        System.out.println("division by zero");
                    }
                    break;
                default:
                    System.out.println("Wrong operation, try again.");
                    result = calc(num1, num2, getOperation());
            }

            return result;
        }
    }
}