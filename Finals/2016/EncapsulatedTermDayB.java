public class EncapsulatedTermDayB {
    private byte dayAndWeek;

    // Using a single byte to store both day and week
    // Where the first 3 bits represent the day and the next 3 bits represent the
    // week.
    // Since each variable needs 3 bits, in total, you would need 6 bits.
    // However, as there's no primitive type that has exactly 6 bits, you can use a
    // byte (8 bits) for efficiency reasons.
    public EncapsulatedTermDayB(int day, int week) {
        if (day < 0 || day > 6 || week < 0 || week > 7)
            throw new IllegalArgumentException("Invalid day or week number specified");
        this.dayAndWeek = (byte) ((day << 3) | week);
    }

    public int getDay() {
        return (dayAndWeek >> 3) & 0b111; // Extracting day from the first 3 bits
    }

    public int getWeek() {
        return dayAndWeek & 0b111; // Extracting week from the last 3 bits
    }
}
