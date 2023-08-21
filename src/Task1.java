public class Task1 {
    public static double obem(int a) {

        return Math.pow(a, 3);
    }

    public static double ploshad(int a) {
        return (6 * Math.pow(a, 2));
    }

    public static void main(String[] args) {
        System.out.println(obem(3));
        System.out.println(ploshad(3));
    }
}
