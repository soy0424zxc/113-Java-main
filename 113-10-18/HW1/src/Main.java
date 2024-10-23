public class Main {
    public static void main(String[] args) {
        // 初始化一個 Time1 物件
        Time1 time = new Time1(12, 30, 45);
        
        // 顯示時間並增加秒數
        displayTime("初始時間", time);
        
        // 增加一秒
        time.tick();
        displayTime("增加 1 秒後的時間", time);
        
        // 增加 60 秒
        for (int i = 0; i < 60; i++) {
            time.tick();
        }
        displayTime("增加 60 秒後的時間", time);
    }

    // 簡化顯示時間的方法
    public static void displayTime(String message, Time1 time) {
        System.out.println(message);
        System.out.println("24 小時制: " + time.printUniversal());
        System.out.println("12 小時制: " + time.printStandard());
    }
}
