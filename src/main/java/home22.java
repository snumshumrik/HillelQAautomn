import java.util.Scanner;

public class home22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите выражение :");
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();
        if (ch == '/') {
            chu(a, b);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    private static void chu(int a, int b) {
        if (b == 0) {
            System.out.println ("Делитель не может быть нулем ~");
        } else {
            System.out.println(a / b);
        }
    }
}