public class Time {
    private int year;
    private int month;
    private int day;

    // 构造方法
    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 实例方法：设置时间
    public void setTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 实例方法：获取时间的字符串表示
    public String getTimeString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
