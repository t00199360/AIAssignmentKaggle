import javax.swing.*;
import java.awt.*;


public class Problem2 {
    public static void main(String[] args) {
        inputYards();
    }

    private static void inputYards() {

        double[] yardArray;
        yardArray= new double[10];

        String yards = "16";
        double yardAsDouble = Double.parseDouble(yards);
        yardArray[0]=yardAsDouble;

        printJText(yards, yardAsDouble, yardArray);


    }

    private static void printJText(String yards, double yardsAsDouble, double[] yardArray) {

        JTextArea yardsTextArea = new JTextArea("Yards\t" + "Inches\n", 10, 3);
        yardsTextArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        String yardArrayAsString="";

        for (int i = 0; i < 10; i++)
        {
            yards = JOptionPane.showInputDialog(null, "Please enter the yard values you want to convert into inches: ");
            double yardAsDouble = Double.parseDouble(yards);
            yardArray[i]=yardAsDouble;



            /*yardArrayAsString = Double.toString(mathtextArea(yardsAsDouble));
            yardsTextArea.append("\n" + yardArrayAsString);*/
            yardsTextArea.append("\n" + yardAsDouble + "\t" + Double.toString(mathtextArea(yardArray[i])));


        }
        JOptionPane.showMessageDialog(null, yardsTextArea);

    }

        private static double mathtextArea (double yardsAsDouble)
        {
            double feet=0;
            double inches=0;
            System.out.print(yardsAsDouble);


            feet = 3 * yardsAsDouble;
            inches = 12 * feet;
            System.out.print(inches);
            return inches;
        }
    }

