public class task1_append_and_length {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        System.out.println("Length: " + sb.length());
    }
}
