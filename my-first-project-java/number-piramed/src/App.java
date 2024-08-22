public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 5; i++) {
            String msg = "";
            while (msg.length() != i) {
                msg = msg + i;
            }
            System.out.println(msg);
        }
    }
}
