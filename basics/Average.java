/**
 * Average
 */
public class Average {

    static double average(int[] values) {

        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();

        } else {

            double sum = 0.0;

            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum / values.length;
        }
    }

    public static void main(String[] args) {

        int[] values = { 87, 86, 89, 83, 94 };
        System.out.println(average(values));

    }
}