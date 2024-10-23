public class Time1 {
    private int hour;   // 小時 (0-23)
    private int minute; // 分鐘 (0-59)
    private int second; // 秒數 (0-59)

    // 建構子，初始化時間
    public Time1(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // 設定時間
    public void setTime(int hour, int minute, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }

    // 時間增加一秒
    public void tick() {
        if (++second == 60) {
            second = 0;
            if (++minute == 60) {
                minute = 0;
                if (++hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    // 24 小時制顯示
    public String printUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // 12 小時制顯示
    public String printStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
}

