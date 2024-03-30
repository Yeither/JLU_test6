public class Main {
    public static void main(String[] args) {
        // 设置专业
        Student.setMajor("通信工程");

        // 创建入学时间对象
        Time admissionTime = new Time(2022, 9, 1);

        // 创建学生对象
        Student student1 = new Student("张三", 1001, admissionTime);
        Student student2 = new Student("李四", 1002, admissionTime);

        // 显示学生信息
        System.out.println("学生1信息：");
        student1.displayInfo();
        System.out.println();

        System.out.println("学生2信息：");
        student2.displayInfo();
    }
}
