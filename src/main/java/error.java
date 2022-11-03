
import java.util.Scanner;


public class error{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите выражение :");
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (ch) {

            case '/':
                chu(a, b);
                break;
            default:
                System.out.println ("Ошибка ввода");
                break;
        }
    }

    private static void chu(int a, int b)

        {
        if (b == 0) {
            System.out.println ("Делитель не может быть нулем ~");
        } else {

            System.out.println ("Коэффициент двух чисел:" + "сумма");
        }
    }

}