public class FileReadTest {
    public static void main(String[] args) {
        try {
            String text = FileUtil.read("CashCard.txt");
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
