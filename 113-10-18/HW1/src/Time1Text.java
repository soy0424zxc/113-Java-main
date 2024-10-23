import java.util.Scanner;

public class Time1Text {
    public static void main(String[] args) {
        // 初始化時間為 14:05:32
        Time1 time = new Time1(14, 5, 32);

        Scanner input = new Scanner(System.in);

        // 顯示初始時間
        System.out.printf("初始 24 小時制: %s%n", time.printUniversal());
        System.out.printf("初始 12 小時制: %s%n", time.printStandard());

        // 請用戶輸入要增加的秒數
        System.out.print("請輸入要增加的秒數: ");
        int secondsToAdd = input.nextInt();

        // 使用迴圈呼叫 tick
        for (int i = 0; i < secondsToAdd; i++) {
            time.tick();
        }

        // 顯示增加時間後的結果
        System.out.printf("增加 %d 秒後的 24 小時制: %s%n", secondsToAdd, time.printUniversal());
        System.out.printf("增加 %d 秒後的 12 小時制: %s%n", secondsToAdd, time.printStandard());

        // 關閉 Scanner
        input.close();
    }
}
