import javax.swing.*;

public class Problem7 {
    public static void main(String[] args) {
        getInputs();
    }

    private static void getInputs() {
        int x = 0;
        while (x == 0) {
            String input = JOptionPane.showInputDialog("Please enter your number for examination");
            int inputAsInt = Integer.parseInt(input);
            if (inputAsInt== -1)
            {
                x++;
            }
            if ((inputAsInt & 1) == 0) {
                JOptionPane.showMessageDialog(null, "The number you inputted is even");
            } else
                JOptionPane.showMessageDialog(null, "The number you entered was odd");
        }
        System.exit(0);
    }
}
