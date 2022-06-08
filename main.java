import java.util.Scanner;

class Calc{
    void calc(int n, int m, int a, int b, int c) {
        int s = 0;

        if (c >= a && c <= n ) {
            System.out.println("Помилка. Неправильно введені дані ! Ділення на нулю");
        } else if ((n < a) || (m < b)) {
            System.out.println("Помилка. Неправильно введені дані !");
        } else {
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    s += (i * j) / (i - c);
                }
            }
            System.out.println("Результат: S = " + s);
        }
    }
}

public class main {

    public static void main(String[] args) {
        final int c = 2;
        Calc rozr = new Calc();

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("С2 = " + 1115 % 5);
        System.out.println("С3 = " + 1115 % 7);
        System.out.println("С5 = " + 1115 % 11);
        System.out.println(" ");

        System.out.println("Введіть значення:");

        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("n: ");
        int n = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("m: ");
        int m = scan.nextInt();


        rozr.calc(n, m, a, b, c);

    }
}