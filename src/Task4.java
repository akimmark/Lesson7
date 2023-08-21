public class Task4 {
    public static int number(int a) {
        int c = a / 10;
        int d = a % 10;
        return 10 * d + c;
    }

    public static void main(String[] args) {
        System.out.println(number(89));
    }
}
