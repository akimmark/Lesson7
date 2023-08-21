public class Task2 {
    public static double dlinna(int r) {
        final double pi = 3.14;
        return 2 * pi * r;
    }

    public static double plosh(int r) {
        return 3.14 * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        System.out.println(dlinna(15));
        System.out.println(plosh(15));
    }
}
