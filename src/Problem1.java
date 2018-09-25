import javax.swing.*;

public class Problem1 {
    public static void main(String[] args) {
        firstCheck();
    }

    private static void firstCheck() {
        String exchange_rate = JOptionPane.showInputDialog(null, "Please enter the value of 1 pound sterling in euros.(Enter 0 to quit the program)");
        double rateAsDouble = Double.parseDouble(exchange_rate);

        if (exchange_rate.equals("0")) {
            JOptionPane.showMessageDialog(null, "Thank you for using the system. Goodbye.");
            System.exit(0);


        } else {
            step2(rateAsDouble);
        }
    }

    private static void step2(Double rateAsDouble) {
        String x="1";
        while (!x.equals("0")) {
            String GBP = JOptionPane.showInputDialog(null, "Please enter the value of GBP you want to convert.");
            double gbpAsDouble = Double.parseDouble(GBP);

            double result = gbpAsDouble * rateAsDouble;
            String resultAsString = Double.toString(result);

            if (!GBP.equals("0")) {
                JOptionPane.showMessageDialog(null, "The value of: " + GBP + "GBP is: €" + String.format("%.2f",(result)));

            }
            else
            {
                x="0";
            }
        }
        System.exit(0);
    }
}
//exchange rate is 1 gbp to 1.13 euro