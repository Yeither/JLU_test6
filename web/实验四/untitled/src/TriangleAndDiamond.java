import java.util.Scanner;

public class TriangleAndDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入行数n
        System.out.print("请输入行数n：");
        int n = scanner.nextInt();

        // 输出右上直角三角形
        System.out.println("右上直角三角形：");
        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 输出左下直角三角形
        System.out.println("左下直角三角形：");
        for (int i = 1; i <= n; i++) {
            // 打印*
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 打印空格
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // 输出菱形
        System.out.println("菱形：");
        for (int i = 1; i <= n; i++) {
            // 打印空格
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // 打印空格
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
