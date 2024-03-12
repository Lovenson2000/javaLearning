import javax.swing.JOptionPane;

/**
 * UserInput
 */
public class UserInput {

    static boolean isArmstrongNumber(int number) {
        String numberString = Integer.toString(number);
        int sum = 0;
        int length = numberString.length();
        for (char digitChar : numberString.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(digitChar), length);
        }
        return sum == number;
    }

    public static void main(String[] args) {

        try {
            String inputValue = JOptionPane.showInputDialog("Enter a number");
            int inputInteger = Integer.parseInt(inputValue);

            if (isArmstrongNumber(inputInteger)) {
                JOptionPane.showMessageDialog(null, inputInteger + " is an Armstrong number");
            } else {
                JOptionPane.showMessageDialog(null, inputInteger + " is not an Armstrong number");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}