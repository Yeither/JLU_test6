public class Student {
    // 静态变量
    private static String major;

    // 实例变量
    private String name;
    private int id;
    private Time admissionTime; // 入学时间

    // 静态方法：设置专业
    public static void setMajor(String major) {
        Student.major = major;
    }

    // 构造方法
    public Student(String name, int id, Time admissionTime) {
        this.name = name;
        this.id = id;
        this.admissionTime = admissionTime;
    }

    // 实例方法：显示学生信息
    public void displayInfo() {
        System.out.println("姓名：" + name);
        System.out.println("学号：" + id);
        System.out.println("专业：" + major);
        System.out.println("入学时间：" + admissionTime.getTimeString());
    }
}
