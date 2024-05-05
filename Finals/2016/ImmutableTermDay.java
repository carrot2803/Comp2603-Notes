public final class ImmutableTermDay {
    private final int day;
    private final int week;

    public ImmutableTermDay(int day, int week) {
        if (day < 0 || day > 6 || week < 0 || week > 7)
            throw new IllegalArgumentException("Invalid day or week number specified");
        this.day = day;
        this.week = week;
    }

    public int getDay() {
        return day;
    }

    public int getWeek() {
        return week;
    }
}
