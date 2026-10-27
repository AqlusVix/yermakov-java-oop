package time;

public class Time {
    private int secondsAll;

    public Time(int secondsAll) {
        this.secondsAll = secondsAll;
    }

    public int getSecondsAll() {
        return secondsAll;
    }

    public void setSecondsAll(int secondsAll) {
        this.secondsAll = secondsAll;
    }

    @Override
    public String toString() {
        int secondsInDay = secondsAll % (24 * 60 * 60);
        int hours = secondsInDay / (60 * 60);
        int minutes = (secondsInDay - hours * 60 * 60) / 60;
        int seconds = secondsInDay - hours * 60 * 60 - minutes * 60;
        return (hours<10?"0" + hours:hours) + ":" + (minutes<10?"0" + minutes:minutes) + ":" + (seconds<10?"0"+seconds:seconds);
    }
}
