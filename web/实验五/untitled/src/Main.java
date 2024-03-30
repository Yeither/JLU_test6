import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 升序排序
        System.out.print("请输入数组的长度n：");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("请输入数组的元素：");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("排序前的数组：" + Arrays.toString(array));
        sortArray(array);
        System.out.println("排序后的数组：" + Arrays.toString(array));

        // 2. 统计高数成绩
        System.out.print("请输入学生人数：");
        int studentCount = scanner.nextInt();

        System.out.println("请输入每个学生的高数成绩（0-100）：");
        int[] scores = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] scoreSegments = {0, 60, 70, 80, 90, 100}; // 分数段划分
        int[] countSegments = new int[scoreSegments.length - 1]; // 分数段人数统计数组

        // 统计分数段人数
        for (int score : scores) {
            for (int i = 0; i < scoreSegments.length - 1; i++) {
                if (score >= scoreSegments[i] && score < scoreSegments[i + 1]) {
                    countSegments[i]++;
                    break;
                }
            }
        }

        // 输出统计结果
        System.out.println("高数成绩分数段统计结果：");
        for (int i = 0; i < countSegments.length; i++) {
            if (i == countSegments.length - 1) {
                System.out.println(scoreSegments[i] + "分以上：" + countSegments[i] + "人");
            } else {
                System.out.println(scoreSegments[i] + "-" + (scoreSegments[i + 1] - 1) + "分：" + countSegments[i] + "人");
            }
        }

        scanner.close();
    }

    // 实现升序排序
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
