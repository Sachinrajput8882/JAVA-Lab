public class task2_reverse_string {
    public static void main(String[] args) {
        String s = "Java", reversed = "";
        for (int i = s.length() - 1; i >= 0; i--)
            reversed += s.charAt(i);
        System.out.println("Reversed: " + reversed);
    }
}
