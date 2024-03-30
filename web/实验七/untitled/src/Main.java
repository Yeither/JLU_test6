public class Main {
    public static void main(String[] args) {
        // 创建学生对象并显示信息
        Student student = new Student("张三", 20, 85.5);
        System.out.println("学生信息：");
        student.displayInfo();
        System.out.println();

        // 创建研究生对象并显示信息
        GraduateStudent graduateStudent = new GraduateStudent("李四", 25, 90.0, "通信工程学院", "通信工程");
        System.out.println("研究生信息：");
        graduateStudent.displayInfo();
    }
}
