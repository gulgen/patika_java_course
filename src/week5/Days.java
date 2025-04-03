package week5;

public enum Days {
    SUNDAY(9, 17),

    MONDAY(8, 16),

    TUESDAY(8, 20),

    WEDNESDAY(9, 16),

    THURSDAY(9, 20),

    FRIDAY(9, 21),

    SATURDAY(10, 22);

    private final int start;
    private final int finish;


    Days(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public int getStart() {
        return start;
    }

    public int getFinish() {
        return finish;
    }
    public static boolean isValidDay(String input) {
        for (Days day : Days.values()) {
            if (day.name().equalsIgnoreCase(input)){
            return true;
        }
        }
        return false;
}
}
