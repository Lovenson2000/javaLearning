package numbers;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int randomNumberBetween1And100 = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNumberBetween1And100);
        System.out.println(Math.max(23, 76)); // 76
        System.out.println((int) Math.sqrt(64)); // 8
        System.out.println(Math.abs(-4.7)); // 4.7
        System.err.println((int) Math.cbrt(27)); // 3
        System.out.println(Math.signum(-34.4)); // -1.0
        System.out.println(Math.signum(34.4)); // 1.0
        System.out.println((int) Math.rint(34.4)); // 34
        System.out.println((int) Math.rint(34.6)); // 35
        System.out.println(Math.round(6.2));
        System.out.println(Math.toDegrees(Math.PI)); // 180.0
    }
}