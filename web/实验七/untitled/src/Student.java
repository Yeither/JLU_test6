public class Student {
    // 实例变量
    private String name;
    private int age;
    private double score;

    // 构造方法
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 显示姓名、年龄和成绩的方法
    public void displayInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + score);
    }

    // 修改成绩的方法
    public void setScore(double score) {
        this.score = score;
    }

    // 设置参数的方法
    public void setParameters(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
