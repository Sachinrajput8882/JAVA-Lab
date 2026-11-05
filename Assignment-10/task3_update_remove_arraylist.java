import java.util.ArrayList;

public class task3_update_remove_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);
        list.set(1, 25);
        list.remove(3);
        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}
