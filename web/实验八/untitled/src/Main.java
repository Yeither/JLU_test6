import six.Time;
import six.Student;

public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        Student.setMajor("计算机科学与技术");

        Time admissionTime = new Time(2022, 9, 1);

        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("学生" + (i + 1), 1000 + i, admissionTime);
        }

        // 模拟学生成绩（假设每个学生有三门课程的成绩）
        int[][] scores = {
                {80, 75, 85},
                {90, 85, 88},
                {85, 78, 92},
                {88, 92, 80},
                {82, 90, 87},
                {91, 89, 84},
                {85, 87, 86},
                {89, 80, 91},
                {86, 92, 88},
                {83, 84, 89}
        };

        // 统计每门课程的最高分和最低分
        int numCourses = 3;
        int[] maxScores = new int[numCourses];
        int[] minScores = new int[numCourses];
        for (int j = 0; j < numCourses; j++) {
            maxScores[j] = Integer.MIN_VALUE;
            minScores[j] = Integer.MAX_VALUE;
        }

        for (int[] studentScores : scores) {
            for (int j = 0; j < numCourses; j++) {
                maxScores[j] = Math.max(maxScores[j], studentScores[j]);
                minScores[j] = Math.min(minScores[j], studentScores[j]);
            }
        }

        // 显示每门课程的最高分和最低分
        String[] courses = {"数学", "语文", "英语"};
        for (int j = 0; j < numCourses; j++) {
            System.out.println(courses[j] + "的最高分为：" + maxScores[j]);
            System.out.println(courses[j] + "的最低分为：" + minScores[j]);
        }
    }
}
