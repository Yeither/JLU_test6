public class GraduateStudent extends Student {
    // 新增实例变量
    private String college;
    private String major;

    // 构造方法
    public GraduateStudent(String name, int age, double score, String college, String major) {
        super(name, age, score);
        this.college = college;
        this.major = major;
    }

    // 显示信息方法（包括姓名、年龄、成绩和专业）
    public void displayInfo() {
        super.displayInfo();
        System.out.println("学院：" + college);
        System.out.println("专业：" + major);
    }

    // 设置参数的方法
    public void setParameters(String name, int age, double score, String college, String major) {
        super.setParameters(name, age, score);
        this.college = college;
        this.major = major;
    }
}
