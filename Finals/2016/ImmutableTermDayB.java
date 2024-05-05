import java.util.HashMap;
import java.util.Map;

public final class ImmutableTermDayB {
    private static final Map<Integer, ImmutableTermDayB> map = new HashMap<>();
    private final int day;
    private final int week;

    private ImmutableTermDayB(int day, int week) {
        this.day = day;
        this.week = week;
    }

    public static ImmutableTermDayB of(int day, int week) {
        int key = day * 10 + week; // Combining day and week into a unique key
        return map.computeIfAbsent(key, k -> new ImmutableTermDayB(day, week));
    }

    public int getDay() {
        return day;
    }

    public int getWeek() {
        return week;
    }
}
