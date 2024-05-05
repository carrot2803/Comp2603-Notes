public class EncapsulatedTermDay {
    private int day; // The day of the week as a number 0-6
    private int week; // The week of the term as a number 0-7

    public EncapsulatedTermDay(int day, int week) {
        if (day < 0 || day > 6 || week < 0 || week > 7) {
            throw new IllegalArgumentException("Invalid day or week number specified");
        }
        this.day = day;
        this.week = week;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 0 || day > 6) 
            throw new IllegalArgumentException("Invalid day number specified");
        this.day = day;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        if (week < 0 || week > 7) 
            throw new IllegalArgumentException("Invalid week number specified");
        this.week = week;
    }
}
