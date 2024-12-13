import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList內容" + list);


        String fruit = list.get(1);
        System.out.println("第二個水果是" + fruit);

        list.set(1,"Blueberry");
        System.out.println("更新後的ArrayList內容" + list);

        list.remove(1);
        System.out.println("刪除後的ArrayList內容" + list);

        int size = list.size();
        System.out.println("目前的ArrayList大小" +list. size());

        boolean containCherry = list.contains("Cherry");
        System.out.println("ArrayList是否包含Cherry" + containCherry);

        if(list.isEmpty()){
            System.out.println("使用迴圈");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }
        else{
            System.out.println("ArrayList是空的");
        }
    }
}
