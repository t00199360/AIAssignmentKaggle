import javax.swing.*;
import java.util.Scanner;

public class Problem8
{
    public static void main(String[] args)
    {
        inputArray();
    }

    private static void inputArray()
    {
        int i=0;
        int[] userInputs;
        userInputs = new int[10];

        for (int x=0;x!=10;x++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter an integer: ");
            userInputs[i] = input.nextInt();
            i++;
        }
    JOptionPane.showMessageDialog(null,"The first value in the array is: " + userInputs[0] +
            "\nThe fifth number in the array is: " + userInputs[4]);
        //check for the first value
        //check for the fifth value
    }
}
