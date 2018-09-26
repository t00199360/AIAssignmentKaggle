import javax.swing.*;

public class Problem5
{
    public static void main(String[] args)
    {
        topLine();
    }

    private static void topLine()
    {
        String a= JOptionPane.showInputDialog("Please enter your value for a");
        double aDouble=Double.parseDouble(a);

        String b= JOptionPane.showInputDialog("Please enter your value for b");//quadratic equation so these seemingly vague identifiers are actually very specific
        double bDouble=Double.parseDouble(b);

        String c= JOptionPane.showInputDialog("Please enter your value for c");
        double cDouble=Double.parseDouble(c);

       double answer1 = (-bDouble + Math.sqrt(Math.pow(bDouble, 2) - (4 * aDouble * cDouble))) / (2 * aDouble);
       double answer2 = (-bDouble - Math.sqrt((bDouble*bDouble) - (4 * aDouble * cDouble))) / (2 * aDouble);

        if (Double.isNaN(answer1) || Double.isNaN(answer2))
        {
            JOptionPane.showMessageDialog(null,"Answer contains imaginary numbers");
        }
        else
            JOptionPane.showMessageDialog(null,"The roots are: " + answer1 + ", " + answer2);
    }
    }

